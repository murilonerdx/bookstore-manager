package com.bookstore.manager.model.author.entity;

import com.bookstore.manager.entity.Auditable;
import com.bookstore.manager.model.books.entity.Book;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Author extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false, unique=true)
    private String name;

    @Column(columnDefinition = "integer default 0")
    private int age;

    @OneToMany(mappedBy="author", fetch=FetchType.LAZY)
    private List<Book> books;
}
