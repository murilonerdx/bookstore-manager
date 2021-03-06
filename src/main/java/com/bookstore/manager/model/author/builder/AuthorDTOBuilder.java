package com.bookstore.manager.model.author.builder;

import com.bookstore.manager.model.author.dto.AuthorDTO;
import com.bookstore.manager.model.author.entity.Author;
import com.bookstore.manager.model.books.entity.Book;
import com.bookstore.manager.model.publishers.entity.Publisher;
import com.bookstore.manager.model.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Builder
@Data
public class AuthorDTOBuilder {
    @Builder.Default
    public final Long id = 1L;
    @Builder.Default
    public final String name = "Roberto";
    @Builder.Default
    public final int age = 24;



    public AuthorDTO builderAuthorDTO(){
        List<Book> list = new ArrayList<>();
        return new AuthorDTO(id, name, age, list);
    }

}
