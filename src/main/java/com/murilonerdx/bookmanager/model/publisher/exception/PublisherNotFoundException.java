package com.murilonerdx.bookmanager.model.publisher.exception;

import javax.persistence.EntityNotFoundException;

public class PublisherNotFoundException extends EntityNotFoundException {

    public PublisherNotFoundException(Long id) {
        super(String.format("Publisher with id %s not exists!", id));
    }
}
