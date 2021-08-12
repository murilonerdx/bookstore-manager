package com.murilonerdx.bookmanager.model.publisher.entity;

import com.murilonerdx.bookmanager.model.auditable.Auditable;
import com.murilonerdx.bookmanager.model.book.entity.Book;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Publisher extends Auditable {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;

  @Column(nullable = false, unique = true) private String name;

  @Column(nullable = false, unique = true, length = 100) private String code;

  @Column(nullable = false, columnDefinition = "TIMESTAMP")
  private LocalDate foundationDate;

  @OneToMany(mappedBy = "publisher", fetch = FetchType.LAZY)
  private List<Book> books;
}
