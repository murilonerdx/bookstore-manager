package com.bookstore.manager.model.author.repository;

import com.bookstore.manager.model.author.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {}
