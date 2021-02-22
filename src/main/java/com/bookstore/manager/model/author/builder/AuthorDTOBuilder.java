package com.bookstore.manager.model.author.builder;

import com.bookstore.manager.model.author.dto.AuthorDTO;
import com.bookstore.manager.model.books.entity.Book;
import lombok.Builder;

import javax.persistence.*;
import java.util.List;

@Builder
public class AuthorDTOBuilder {
    @Builder.Default
    public final Long id = 1L;
    @Builder.Default
    public final String name = "Murilo Pereira";
    @Builder.Default
    public final int age = 20;

    public AuthorDTO builderAuthorDTO(){
        return new AuthorDTO(id, name, age, null);
    }
}
