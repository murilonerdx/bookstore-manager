package com.murilonerdx.bookmanager.model.author.repository;

import com.murilonerdx.bookmanager.model.author.entity.Author;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
  Optional<Author> findByName(String name);
}
