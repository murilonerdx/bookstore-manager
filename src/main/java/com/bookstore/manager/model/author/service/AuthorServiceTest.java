package com.bookstore.manager.model.author.service;

import com.bookstore.manager.model.author.builder.AuthorDTOBuilder;
import com.bookstore.manager.model.author.dto.AuthorDTO;
import com.bookstore.manager.model.author.entity.Author;
import com.bookstore.manager.model.author.exception.AuthorAlreadyExistsException;
import com.bookstore.manager.model.author.exception.AuthorNotFoundException;
import com.bookstore.manager.model.author.mapper.AuthorMapper;
import com.bookstore.manager.model.author.repository.AuthorRepository;
import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;
import java.util.List;
import java.util.Optional;


import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;


@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class AuthorServiceTest {
    private final AuthorMapper authorMapper = AuthorMapper.INSTANCE;


    @Mock
    private AuthorRepository authorRepository;
    @InjectMocks
    private AuthorService authorService;

    private MockMvc mockMvc;

    private AuthorDTOBuilder authorDTOBuilder;


    @BeforeEach
    void setUp() {
        authorDTOBuilder = AuthorDTOBuilder.builder().build();
        Object[] controllers;
        mockMvc = MockMvcBuilders.standaloneSetup(authorService)
                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
                .setViewResolvers((s, locale) -> new MappingJackson2JsonView())
                .build();
    }


    @SneakyThrows
    @Test
    void whenNewAuthorIsInformedThenItShouldBeCreated() throws AuthorAlreadyExistsException {
        //Given
        AuthorDTO expectedAuthorToCreatedDTO = authorDTOBuilder.builderAuthorDTO();
        Author expectedCreatedAuthor = authorMapper.toModel(expectedAuthorToCreatedDTO);

        //when
        when(authorRepository.save(expectedCreatedAuthor)).thenReturn(expectedCreatedAuthor);
        when(authorRepository.findById(expectedAuthorToCreatedDTO.getId())).thenReturn(Optional.empty());
        AuthorDTO createdAuthorDTO = authorService.create(expectedAuthorToCreatedDTO);

        //then
        assertThat(createdAuthorDTO, equalTo(expectedAuthorToCreatedDTO));
    }

//    @Test
//    void whenExistingAuthorIsInformedThenAnExceptionShouldBeThrown() {
//        AuthorDTO expectedAuthorToCreatedDTO = authorDTOBuilder.builderAuthorDTO();
//        Author expectedCreatedAuthor = authorMapper.toModel(expectedAuthorToCreatedDTO);
//
//        when(authorRepository.findById(expectedAuthorToCreatedDTO.getId())).thenReturn(Optional.of(expectedCreatedAuthor));
//
//        assertThrows(AuthorNotFoundException.class, () -> authorService.create(expectedAuthorToCreatedDTO));
//    }

    @Test
    void whenValidIdIsGivenThenAnAuthorShouldBeReturned() {
        AuthorDTO expectedAuthorToCreatedDTO = authorDTOBuilder.builderAuthorDTO();
        Author expectedCreatedAuthor = authorMapper.toModel(expectedAuthorToCreatedDTO);

        when(authorRepository.findById(expectedAuthorToCreatedDTO.getId())).thenReturn(Optional.of(expectedCreatedAuthor));

        AuthorDTO foundAuthorDTO = authorService.findById(expectedCreatedAuthor.getId());

        assertThat(foundAuthorDTO, equalTo(expectedAuthorToCreatedDTO));

    }

    @Test
    void whenInvalidIdIsGivenThenAnExceptionShouldBeThrown() {
        AuthorDTO expectedAuthorToCreatedDTO = authorDTOBuilder.builderAuthorDTO();

        when(authorRepository.findById(expectedAuthorToCreatedDTO.getId())).thenReturn(Optional.empty());


        assertThrows(AuthorNotFoundException.class, () -> authorService.findById(expectedAuthorToCreatedDTO.getId()));

    }

    @Test
    void whenListAuthorsIsCalledThenItShouldBeReturned() {
        AuthorDTO expectedAuthorToCreatedDTO = authorDTOBuilder.builderAuthorDTO();
        Author expectedCreatedAuthor = authorMapper.toModel(expectedAuthorToCreatedDTO);

        when(authorRepository.findAll()).thenReturn(Collections.singletonList(expectedCreatedAuthor));
        List<AuthorDTO> allAuthors = authorService.findByAll();


        assertThat(allAuthors.size(), equalTo(1));
        assertThat(allAuthors.get(0), equalTo(expectedAuthorToCreatedDTO));

    }

    @Test
    void whenListAuthorsIsCalledThenEmptyItShouldBeReturned() {


        when(authorRepository.findAll()).thenReturn(Collections.EMPTY_LIST);
        List<AuthorDTO> allAuthors = authorService.findByAll();
        assertThat(allAuthors.size(), equalTo(0));

    }

    @Test
    void whenValidAuthorIdIsGivenThenItShouldBeDeleted() {
        AuthorDTO expectedAuthorToCreatedDTO = authorDTOBuilder.builderAuthorDTO();
        Author expectedCreatedAuthor = authorMapper.toModel(expectedAuthorToCreatedDTO);

        Long expectedDeletedAuthorId = expectedAuthorToCreatedDTO.getId();

        doNothing().when(authorRepository).deleteById(expectedDeletedAuthorId);
        when(authorRepository.findById(expectedDeletedAuthorId)).thenReturn(Optional.of(expectedCreatedAuthor));

        authorService.delete(expectedDeletedAuthorId);

        verify(authorRepository, times(1)).deleteById(expectedDeletedAuthorId);
        verify(authorRepository, times(1)).findById(expectedDeletedAuthorId);
    }


//    @Test
//    void whenInvalidAuthorIdIsGivenThenItShouldBeDeleted() {
//        AuthorDTO expectedAuthorToCreatedDTO = authorDTOBuilder.builderAuthorDTO();
//        Author expectedCreatedAuthor = authorMapper.toModel(expectedAuthorToCreatedDTO);
//        when(authorRepository.findById(expectedAuthorToCreatedDTO.getId())).thenReturn(Optional.empty());
//        authorService.delete(expectedAuthorToCreatedDTO.getId());
//
//        assertThrows(AuthorNotFoundException.class, () -> authorService.delete(expectedCreatedAuthor.getId()));
//    }


}


