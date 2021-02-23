package com.bookstore.manager.model.author.controller;

import com.bookstore.manager.model.author.dto.AuthorDTO;
import com.bookstore.manager.model.author.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value="/api/v1/authors")
public class AuthorController implements AuthorControllerDocs {
    @Autowired
    private AuthorService authorService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public AuthorDTO create(@RequestBody @Valid AuthorDTO authorDTO) {
        return authorService.create(authorDTO);
    }
}
