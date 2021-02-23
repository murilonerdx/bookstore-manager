package com.bookstore.manager.model.author.dto;

import com.bookstore.manager.model.books.entity.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDTO {

    private Long id;

    @NotNull(message = "Please enter name")
    @Size(max =255)
    private String name;


    @NotNull(message="Age is empty")
    @Max(128)
    private int age;

    private List<Book> books;

}
