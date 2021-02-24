package com.bookstore.manager.model.author.exception;


import javax.persistence.EntityExistsException;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AuthorAlreadyExistsException extends EntityExistsException {
    public AuthorAlreadyExistsException(@NotNull @Size String name) {
        super(String.format("Author %s exists ", name));
    }
}
