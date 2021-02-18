package com.bookstore.manager.model.user.entity;

import com.bookstore.manager.entity.Auditable;
import com.bookstore.manager.model.books.entity.Book;
import com.bookstore.manager.model.user.enums.Gender;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class User extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private int age;

    @Enumerated(EnumType.STRING)
    @Column(nullable=false, length=20)
    private Gender gender;

    @Column(nullable=false,unique=true, length=100)
    private String email;

    @Column(nullable=false,unique=true)
    private String username;

    @Column(nullable=false,unique=true)
    private String password;

    @Column(nullable=false)
    private LocalDate birthDate;

    @OneToMany(mappedBy="user", fetch=FetchType.LAZY)
    private List<Book> books;
}
