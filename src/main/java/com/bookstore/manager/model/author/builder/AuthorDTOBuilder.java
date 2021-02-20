package com.bookstore.manager.model.author.builder;

import com.bookstore.manager.model.books.entity.Book;
import lombok.Builder;

import javax.persistence.*;
import java.util.List;

@Builder
public class AuthorDTOBuilder {
    private final Long id = 1L;
    private final String nome = "Murilo Pereira";

    private final int age = 20;

}
