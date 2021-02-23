package com.bookstore.manager.model.author.exception;

public class AuthorAlreadyExistsException extends Throwable {
    public AuthorAlreadyExistsException(String name) {
        super(String.format("User with name %s already exists!", name));
    }
}
