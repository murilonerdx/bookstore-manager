package com.murilonerdx.bookmanager.model.book.repository;

import com.murilonerdx.bookmanager.model.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
