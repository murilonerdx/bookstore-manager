package com.bookstore.manager.model.author.exception;

import javax.persistence.EntityNotFoundException;

public class AuthorNotFoundException extends EntityNotFoundException {
    public AuthorNotFoundException(Long id) {
        super(String.format("Autor with id %s not exists", id));
    }
}
