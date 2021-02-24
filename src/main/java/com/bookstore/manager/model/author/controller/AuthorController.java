package com.bookstore.manager.model.author.controller;

import com.bookstore.manager.exception.BookstoreExceptionHandler;
import com.bookstore.manager.model.author.dto.AuthorDTO;
import com.bookstore.manager.model.author.service.AuthorService;
import org.hibernate.cfg.beanvalidation.IntegrationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.management.RuntimeErrorException;
import javax.persistence.EntityExistsException;
import javax.validation.Valid;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/authors")
public class AuthorController implements AuthorControllerDocs {
    @Autowired
    private AuthorService authorService;

    BookstoreExceptionHandler exceptionHandler = new BookstoreExceptionHandler();

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public AuthorDTO create(@RequestBody @Valid AuthorDTO authorDTO) {
        try {
            return authorService.create(authorDTO);
        } catch (EntityExistsException e) {
            exceptionHandler.handlerEntityExistException(e);
        }
        return null;
    }

    @GetMapping(value = "/{id}")
    public AuthorDTO findById(@PathVariable Long id) {
        return authorService.findById(id);

    }

    @GetMapping()
    public List<AuthorDTO> findAll(){
        return authorService.findByAll();
    }
}
