package com.bookstore.manager.model.author.controller;

import com.bookstore.manager.model.author.builder.AuthorDTOBuilder;
import com.bookstore.manager.model.author.dto.AuthorDTO;
import com.bookstore.manager.model.author.entity.Author;
import com.bookstore.manager.model.author.exception.AuthorAlreadyExistsException;
import com.bookstore.manager.model.author.mapper.AuthorMapper;
import com.bookstore.manager.model.author.repository.AuthorRepository;
import com.bookstore.manager.model.author.service.AuthorService;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.hamcrest.core.Is;
import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;


import java.util.Collections;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class AuthorControllerTest {
    private static final String AUTHOR_API_URL_PATH = "/api/v1/authors";

    private final AuthorMapper authorMapper = AuthorMapper.INSTANCE;

    @Mock
    private AuthorService authorService;

    @InjectMocks
    private AuthorController authorController;

    @Mock
    private AuthorRepository authorRepository;

    private MockMvc mockMvc;

    private AuthorDTOBuilder authorDTOBuilder;

    @BeforeEach
    void setUp() {
        authorDTOBuilder = AuthorDTOBuilder.builder().build();
        Object[] controllers;
        mockMvc = MockMvcBuilders.standaloneSetup(authorController)
                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
                .setViewResolvers((s, locale) -> new MappingJackson2JsonView())
                .build();
    }

    @Test
    void whenPostIsCalledThenStatusCreatedShouldBeReturned() throws Exception {
        AuthorDTO expectedAuthorToCreatedDTO = authorDTOBuilder.builderAuthorDTO();

        Mockito.when(authorService.create(expectedAuthorToCreatedDTO))
                .thenReturn(expectedAuthorToCreatedDTO);

        mockMvc.perform(post(AUTHOR_API_URL_PATH).contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(expectedAuthorToCreatedDTO)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id", Is.is(expectedAuthorToCreatedDTO.getId().intValue())))
                .andExpect(jsonPath("$.name", Is.is(expectedAuthorToCreatedDTO.getName())))
                .andExpect(jsonPath("$.age", Is.is(expectedAuthorToCreatedDTO.getAge())));


    }

    @Test
    void whenPostIsCalledWithoutRequiredFieldThenBadRequestStatusShouldBeInformed() throws Exception {

        AuthorDTO expectedAuthorToCreatedDTO = authorDTOBuilder.builderAuthorDTO();
        expectedAuthorToCreatedDTO.setName(null);

        when(authorService.create(expectedAuthorToCreatedDTO))
                .thenReturn(expectedAuthorToCreatedDTO);

        mockMvc.perform(post(AUTHOR_API_URL_PATH).contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(expectedAuthorToCreatedDTO)))
                .andExpect(status().isBadRequest());
    }

    private String asJsonString(AuthorDTO expectedAuthorToCreatedDTO) {
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
            objectMapper.registerModule(new JavaTimeModule());
            return objectMapper.writeValueAsString(expectedAuthorToCreatedDTO);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    @Test
    void whenGetListIsCalledThenStatusOkShouldBeReturned() throws Exception {
        AuthorDTO expectedAuthorToCreatedDTO = authorDTOBuilder.builderAuthorDTO();

        when(authorService.findByAll()).thenReturn(Collections.singletonList(expectedAuthorToCreatedDTO));


        mockMvc.perform(get(AUTHOR_API_URL_PATH).contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(expectedAuthorToCreatedDTO)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].id", Is.is(expectedAuthorToCreatedDTO.getId().intValue())))
                .andExpect(jsonPath("$[0].name", Is.is(expectedAuthorToCreatedDTO.getName())))
                .andExpect(jsonPath("$[0].age", Is.is(expectedAuthorToCreatedDTO.getAge())));


    }
}
