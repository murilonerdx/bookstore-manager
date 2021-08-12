package com.murilonerdx.bookmanager.model.user.entity;

import com.murilonerdx.bookmanager.model.auditable.Auditable;
import com.murilonerdx.bookmanager.model.book.entity.Book;
import com.murilonerdx.bookmanager.model.user.enums.Gender;
import com.murilonerdx.bookmanager.model.user.enums.Role;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class User extends Auditable {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;

  @Column(nullable = false) private String name;

  @Column(nullable = false) private int age;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false, length = 20)
  private Gender gender;

  @Column(nullable = false, unique = true, length = 100) private String email;

  @Column(nullable = false, unique = true) private String username;

  @Column(nullable = false) private String password;

  @Column(nullable = false, columnDefinition = "TIMESTAMP")
  private LocalDate birthdate;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
  private List<Book> books;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false, length = 20)
  private Role role;
}
