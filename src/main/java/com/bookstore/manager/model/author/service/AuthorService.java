package com.bookstore.manager.model.author.service;

import com.bookstore.manager.model.author.mapper.AuthorMapper;
import com.bookstore.manager.model.author.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ServiceLoader;

@Service
public class AuthorService {

    private final static ServiceLoader<AuthorMapper> authorMapper = AuthorMapper.INSTANCE;

    @Autowired
    private AuthorRepository repository;

    public AuthorService(AuthorRepository repository) {
        this.repository = repository;
    }
}
