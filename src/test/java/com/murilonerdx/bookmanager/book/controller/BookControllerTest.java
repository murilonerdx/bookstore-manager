package com.murilonerdx.bookmanager.book.controller;

import com.murilonerdx.bookmanager.book.builder.BookRequestDTOBuilder;
import com.murilonerdx.bookmanager.book.builder.BookResponseDTOBuilder;
import com.murilonerdx.bookmanager.model.book.controller.BookController;
import com.murilonerdx.bookmanager.model.book.dto.BookRequestDTO;
import com.murilonerdx.bookmanager.model.book.dto.BookResponseDTO;
import com.murilonerdx.bookmanager.model.book.service.BookService;
import com.murilonerdx.bookmanager.model.user.dto.AuthenticatedUser;
import com.murilonerdx.bookmanager.utils.JsonConvertionUtils;
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

import java.util.Collections;

import static org.hamcrest.core.Is.is;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
public class BookControllerTest {

    private static final String BOOKS_API_URL_PATH = "/api/v1/books";

    @Mock
    private BookService bookService;

    @InjectMocks
    private BookController bookController;

    private MockMvc mockMvc;

    private BookRequestDTOBuilder bookRequestDTOBuilder;

    private BookResponseDTOBuilder bookResponseDTOBuilder;

    @BeforeEach
    void setUp() {
        bookRequestDTOBuilder = BookRequestDTOBuilder.builder().build();
        bookResponseDTOBuilder = BookResponseDTOBuilder.builder().build();
        mockMvc = MockMvcBuilders.standaloneSetup(bookController)
                .addFilters()
                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
                .setViewResolvers((s, locale) -> new MappingJackson2JsonView())
                .build();
    }

    @Test
    void whenPOSTIsCalledThenCreatedShouldBeInformed() throws Exception {
        BookRequestDTO expectedBookToCreateDTO = bookRequestDTOBuilder.buildRequestBookDTO();
        BookResponseDTO expectedCreatedBookDTO = bookResponseDTOBuilder.buildBookResponseDTO();

        when(bookService.create(any(AuthenticatedUser.class), eq(expectedBookToCreateDTO))).thenReturn(expectedCreatedBookDTO);

        mockMvc.perform(post(BOOKS_API_URL_PATH)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(JsonConvertionUtils.asJsonString(expectedBookToCreateDTO)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id", is(expectedBookToCreateDTO.getId().intValue())))
                .andExpect(jsonPath("$.name", is(expectedBookToCreateDTO.getName())))
                .andExpect(jsonPath("$.isbn", is(expectedBookToCreateDTO.getIsbn())));
    }

    @Test
    void whenPOSTIsCalledWithoutRequiredFieldsThenBadRequestShouldBeInformed() throws Exception {
        BookRequestDTO expectedBookToCreateDTO = bookRequestDTOBuilder.buildRequestBookDTO();
        expectedBookToCreateDTO.setIsbn(null);

        mockMvc.perform(post(BOOKS_API_URL_PATH)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(JsonConvertionUtils.asJsonString(expectedBookToCreateDTO)))
                .andExpect(status().isBadRequest());
    }

    @Test
    void whenGETIsCalledThenStatusOkShouldBeInformed() throws Exception {
        BookRequestDTO expectedBookToFind = bookRequestDTOBuilder.buildRequestBookDTO();
        BookResponseDTO expectedCreatedBookDTO = bookResponseDTOBuilder.buildBookResponseDTO();

        when(bookService.findByIdAndUser(any(AuthenticatedUser.class), eq(expectedBookToFind.getId()))).thenReturn(expectedCreatedBookDTO);

        mockMvc.perform(get(BOOKS_API_URL_PATH + "/" + expectedBookToFind.getId())
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", is(expectedBookToFind.getId().intValue())))
                .andExpect(jsonPath("$.name", is(expectedBookToFind.getName())))
                .andExpect(jsonPath("$.isbn", is(expectedBookToFind.getIsbn())));
    }

    @Test
    void whenGETListIsCalledThenStatusOkShouldBeInformed() throws Exception {
        BookRequestDTO expectedBookToFind = bookRequestDTOBuilder.buildRequestBookDTO();
        BookResponseDTO expectedCreatedBookDTO = bookResponseDTOBuilder.buildBookResponseDTO();

        when(bookService.findAllByUser(any(AuthenticatedUser.class)))
                .thenReturn(Collections.singletonList(expectedCreatedBookDTO));

        mockMvc.perform(get(BOOKS_API_URL_PATH)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].id", is(expectedBookToFind.getId().intValue())))
                .andExpect(jsonPath("$[0].name", is(expectedBookToFind.getName())))
                .andExpect(jsonPath("$[0].isbn", is(expectedBookToFind.getIsbn())));
    }

    @Test
    void whenPUTIsCalledThenStatusOkShouldBeInformed() throws Exception {
        BookRequestDTO expectedBookToUpdateDTO = bookRequestDTOBuilder.buildRequestBookDTO();
        BookResponseDTO expectedUpdatedBookDTO = bookResponseDTOBuilder.buildBookResponseDTO();

        when(bookService.updateByUser(
                any(AuthenticatedUser.class),
                eq(expectedBookToUpdateDTO.getId()),
                eq(expectedBookToUpdateDTO))).thenReturn(expectedUpdatedBookDTO);

        mockMvc.perform(put(BOOKS_API_URL_PATH + "/" + expectedBookToUpdateDTO.getId())
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(JsonConvertionUtils.asJsonString(expectedBookToUpdateDTO)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", is(expectedBookToUpdateDTO.getId().intValue())))
                .andExpect(jsonPath("$.name", is(expectedBookToUpdateDTO.getName())))
                .andExpect(jsonPath("$.isbn", is(expectedBookToUpdateDTO.getIsbn())));
    }

    @Test
    void whenDELETEIsCalledThenStatusNoContentShouldBeInformed() throws Exception {
        BookRequestDTO expectedBookToFind = bookRequestDTOBuilder.buildRequestBookDTO();

        doNothing().when(bookService)
                .deleteByIdAndUser(any(AuthenticatedUser.class), eq(expectedBookToFind.getId()));

        mockMvc.perform(delete(BOOKS_API_URL_PATH + "/" + expectedBookToFind.getId())
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNoContent());
    }
}
