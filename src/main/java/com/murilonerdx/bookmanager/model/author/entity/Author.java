package com.murilonerdx.bookmanager.model.author.entity;

import com.murilonerdx.bookmanager.auditable.Auditable;
import com.murilonerdx.bookmanager.model.book.entity.Book;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Author extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(columnDefinition = "integer default 0")
    private int age;

    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    private List<Book> books;
}
