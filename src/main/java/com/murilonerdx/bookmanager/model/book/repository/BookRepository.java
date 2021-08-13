package com.murilonerdx.bookmanager.model.book.repository;

import com.murilonerdx.bookmanager.model.book.entity.Book;
import com.murilonerdx.bookmanager.model.user.entity.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
  Optional<Book> findByNameAndIsbnAndUser(String name, String isbn, User user);

  Optional<Book> findByIdAndUser(Long id, User user);

  List<Book> findAllByUser(User user);

  void deleteByIdAndUser(Long id, User user);
}
