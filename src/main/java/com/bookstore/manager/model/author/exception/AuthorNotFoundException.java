package com.bookstore.manager.model.author.exception;

import javax.persistence.EntityNotFoundException;

public class AuthorNotFoundException extends EntityNotFoundException {
    public AuthorNotFoundException(Long id) {
        super(String.format("Author %s not found", id));
    }
}
