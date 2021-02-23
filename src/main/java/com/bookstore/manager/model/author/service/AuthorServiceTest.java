package com.bookstore.manager.model.author.service;

import com.bookstore.manager.model.author.builder.AuthorDTOBuilder;
import com.bookstore.manager.model.author.dto.AuthorDTO;
import com.bookstore.manager.model.author.entity.Author;
import com.bookstore.manager.model.author.exception.AuthorAlreadyExistsException;
import com.bookstore.manager.model.author.mapper.AuthorMapper;
import com.bookstore.manager.model.author.repository.AuthorRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.Optional;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class AuthorServiceTest {
    private final AuthorMapper authorMapper = AuthorMapper.INSTANCE;

    @Mock
    private AuthorRepository authorRepository;
    @InjectMocks
    private AuthorService authorService;

    @Autowired
    private SessionFactory usermanagementSessionFactory;
    private Session session;

    private AuthorDTOBuilder authorDTOBuilder;

    @BeforeEach
    void seUp() {
        AuthorDTOBuilder authorDTOBuilder = AuthorDTOBuilder.builder().build();
        AuthorDTO expectedCreatedAuthor = authorDTOBuilder.builderAuthorDTO();
    }

    @PostConstruct
    public void init() {
        session = usermanagementSessionFactory.getCurrentSession();
    }

    @Test
    void whenNewAuthorIsInformedThenItShouldBeCreated() {
        //Given
        AuthorDTO expectedAuthorToCreatedDTO = authorDTOBuilder.builderAuthorDTO();
        Author expectedCreatedAuthor = authorMapper.toModel(expectedAuthorToCreatedDTO);

        //when
        when(authorRepository.save(expectedCreatedAuthor)).thenReturn(expectedCreatedAuthor);
        when(authorRepository.findById(expectedAuthorToCreatedDTO.getName())).thenReturn(Optional.empty());
        AuthorDTO createdAuthorDTO = authorService.create(expectedAuthorToCreatedDTO);

        //then
        assertThat(createdAuthorDTO, is(equalTo(expectedAuthorToCreatedDTO)));
    }

    @Test
    void whenExistingAuthorIsInformedThenAnExceptionShouldBeThrown() {
        AuthorDTO expectedAuthorToCreatedDTO = authorDTOBuilder.builderAuthorDTO();
        Author expectedCreatedAuthor = authorMapper.toModel(expectedAuthorToCreatedDTO);

        when(authorRepository.findById(expectedAuthorToCreatedDTO.getName())).thenReturn(Optional.of(expectedCreatedAuthor));

        assertThrows(AuthorAlreadyExistsException.class, ()->authorService.create(expectedAuthorToCreatedDTO));
    }
}


