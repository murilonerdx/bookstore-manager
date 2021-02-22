package com.bookstore.manager.model.author.service;

import com.bookstore.manager.model.author.mapper.AuthorMapper;
import com.bookstore.manager.model.author.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class AuthorService {

    private final AuthorMapper authorMapper = AuthorMapper.INSTANCE;

    @Autowired
    private AuthorRepository repository;

}
