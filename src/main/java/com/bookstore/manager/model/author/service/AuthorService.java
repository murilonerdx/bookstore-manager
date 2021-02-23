package com.bookstore.manager.model.author.service;

import com.bookstore.manager.model.author.dto.AuthorDTO;
import com.bookstore.manager.model.author.entity.Author;
import com.bookstore.manager.model.author.exception.AuthorAlreadyExistsException;
import com.bookstore.manager.model.author.mapper.AuthorMapper;
import com.bookstore.manager.model.author.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class AuthorService {

    private final AuthorMapper authorMapper = AuthorMapper.INSTANCE;

    @Autowired
    private AuthorRepository repository;



    public AuthorDTO create(AuthorDTO authorDTO){
//        repository.findById(authorDTO.getId()).ifPresent(author ->{throw new AuthorAlreadyExistsException(author.getName());});
        Author authorToCreate = authorMapper.toModel(authorDTO);
        Author createdAuthor = repository.save(authorToCreate);
        return authorMapper.toDTO(createdAuthor);
    }
}
