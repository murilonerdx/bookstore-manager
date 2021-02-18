package com.bookstore.manager.model.publishers.entity;

import com.bookstore.manager.entity.Auditable;
import com.bookstore.manager.model.books.entity.Book;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Publisher extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, unique=true)
    private String name;

    @Column(nullable = false, unique=true, length = 100)
    private String code;

    @Column(nullable = false, columnDefinition = "TIMESTAMP")
    private LocalDate foundationDate;

    @OneToMany(mappedBy="publisher", fetch=FetchType.LAZY)
    private List<Book> books;
}
