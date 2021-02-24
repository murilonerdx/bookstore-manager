package com.bookstore.manager.model.author.controller;

import com.bookstore.manager.model.author.dto.AuthorDTO;
import com.bookstore.manager.model.author.exception.AuthorAlreadyExistsException;
import com.bookstore.manager.model.author.exception.AuthorNotFoundException;
import com.bookstore.manager.model.author.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/authors")
public class AuthorController implements AuthorControllerDocs {
    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public AuthorDTO create(@RequestBody @Valid AuthorDTO authorDTO) throws AuthorAlreadyExistsException {
        try {
            return authorService.create(authorDTO);
        } catch (DataIntegrityViolationException | EntityExistsException e) {
            throw new AuthorAlreadyExistsException(authorDTO.getName());
        }
    }

    @GetMapping(value = "/{id}")
    public AuthorDTO findById(@PathVariable Long id) {
        return authorService.findById(id);
    }

    @GetMapping()
    public List<AuthorDTO> findAll() {
        return authorService.findByAll();
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        authorService.delete(id);
    }
}
