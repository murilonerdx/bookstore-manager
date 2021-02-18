package com.bookstore.manager.model.books.repository;

import com.bookstore.manager.model.books.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
