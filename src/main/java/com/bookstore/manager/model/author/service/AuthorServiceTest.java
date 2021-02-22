package com.bookstore.manager.model.author.service;

import com.bookstore.manager.model.author.builder.AuthorDTOBuilder;
import com.bookstore.manager.model.author.dto.AuthorDTO;
import com.bookstore.manager.model.author.mapper.AuthorMapper;
import com.bookstore.manager.model.author.repository.AuthorRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AuthorServiceTest {
    private final AuthorMapper authorMapper = AuthorMapper.INSTANCE;

    @Mock
    private AuthorRepository authorRepository;
    @InjectMocks
    private AuthorService authorService;

    private AuthorDTOBuilder authorDTOBuilder;

    @BeforeEach
    void seUp(){
        authorDTOBuilder = AuthorDTOBuilder.builder().build();
        AuthorDTO authorDTO = authorDTOBuilder.builderAuthorDTO();
    }
}
