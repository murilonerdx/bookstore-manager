package com.bookstore.manager.model.author.dto;

import com.bookstore.manager.model.books.entity.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDTO implements Serializable {

    private Long id;

    @NotNull(message = "Please enter name")
    @Size(max = 255, min = 1)
    private String name;


    @NotNull(message="Age is empty")
    @Max(128)
    @Min(1)
    private int age;

    private List<Book> books;

}
