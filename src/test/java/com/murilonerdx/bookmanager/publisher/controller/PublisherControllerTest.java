package com.murilonerdx.bookmanager.publisher.controller;

import static com.murilonerdx.bookmanager.utils.JsonConvertionUtils.asJsonString;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.murilonerdx.bookmanager.model.publisher.controller.PublisherController;
import com.murilonerdx.bookmanager.model.publisher.dto.PublisherDTO;
import com.murilonerdx.bookmanager.model.publisher.service.PublisherService;
import com.murilonerdx.bookmanager.publisher.builder.PublisherDTOBuilder;
import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@ExtendWith(MockitoExtension.class)
public class PublisherControllerTest {

  private static final String PUBLISHER_API_URL_PATH = "/api/v1/publishers";

  private MockMvc mockMvc;

  @Mock private PublisherService publisherService;

  @InjectMocks private PublisherController publisherController;

  private PublisherDTOBuilder publisherDTOBuilder;

  @BeforeEach
  void setUp() {
    publisherDTOBuilder = PublisherDTOBuilder.builder().build();
    mockMvc =
        MockMvcBuilders.standaloneSetup(publisherController)
            .setCustomArgumentResolvers(
                new PageableHandlerMethodArgumentResolver())
            .setViewResolvers((s, locale) -> new MappingJackson2JsonView())
            .build();
  }

  @Test
  void whenPOSTIsCalledThenCreatedShouldBeInformed() throws Exception {
    PublisherDTO expectedCreatedPublisherDTO =
        PublisherDTOBuilder.builder().build().buildPublisherDTO();

    when(publisherService.create(expectedCreatedPublisherDTO))
        .thenReturn(expectedCreatedPublisherDTO);

    mockMvc
        .perform(post(PUBLISHER_API_URL_PATH)
                     .contentType(MediaType.APPLICATION_JSON)
                     .content(asJsonString(expectedCreatedPublisherDTO)))
        .andExpect(status().isCreated())
        .andExpect(jsonPath("$.id",
                            is(expectedCreatedPublisherDTO.getId().intValue())))
        .andExpect(
            jsonPath("$.name", is(expectedCreatedPublisherDTO.getName())))
        .andExpect(
            jsonPath("$.code", is(expectedCreatedPublisherDTO.getCode())));
  }

  @Test
  void whenPOSTIsCalledWithoutRequiredFieldThenBadRequestShouldBeInformed()
      throws Exception {
    PublisherDTO expectedCreatedPublisherDTO =
        PublisherDTOBuilder.builder().build().buildPublisherDTO();
    expectedCreatedPublisherDTO.setName(null);

    mockMvc
        .perform(post(PUBLISHER_API_URL_PATH)
                     .contentType(MediaType.APPLICATION_JSON)
                     .content(asJsonString(expectedCreatedPublisherDTO)))
        .andExpect(status().isBadRequest());
  }

  @Test
  void whenGETListIsCalledThenOkShouldBeReturned() throws Exception {
    PublisherDTO expectedPublisherToFindDTO =
        PublisherDTOBuilder.builder().build().buildPublisherDTO();

    when(publisherService.findAll())
        .thenReturn(Collections.singletonList(expectedPublisherToFindDTO));

    mockMvc
        .perform(
            get(PUBLISHER_API_URL_PATH).contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$[0].id",
                            is(expectedPublisherToFindDTO.getId().intValue())))
        .andExpect(
            jsonPath("$[0].name", is(expectedPublisherToFindDTO.getName())))
        .andExpect(
            jsonPath("$[0].code", is(expectedPublisherToFindDTO.getCode())));
  }

  @Test
  void whenGETWithValidIdIsCalledThenOkShouldBeReturned() throws Exception {
    PublisherDTO expectedPublisherToFindDTO =
        PublisherDTOBuilder.builder().build().buildPublisherDTO();

    when(publisherService.findById(expectedPublisherToFindDTO.getId()))
        .thenReturn(expectedPublisherToFindDTO);

    mockMvc
        .perform(get(PUBLISHER_API_URL_PATH + "/" +
                     expectedPublisherToFindDTO.getId())
                     .contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(
            jsonPath("$.id", is(expectedPublisherToFindDTO.getId().intValue())))
        .andExpect(jsonPath("$.name", is(expectedPublisherToFindDTO.getName())))
        .andExpect(
            jsonPath("$.code", is(expectedPublisherToFindDTO.getCode())));
  }

  @Test
  void whenDELETEWithValidIdIsCalledThenNoContentShouldBeReturned()
      throws Exception {
    PublisherDTO expectedPublisherToDeleteDTO =
        PublisherDTOBuilder.builder().build().buildPublisherDTO();

    doNothing()
        .when(publisherService)
        .delete(expectedPublisherToDeleteDTO.getId());

    mockMvc
        .perform(delete(PUBLISHER_API_URL_PATH + "/" +
                        expectedPublisherToDeleteDTO.getId())
                     .contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isNoContent());
  }
}
