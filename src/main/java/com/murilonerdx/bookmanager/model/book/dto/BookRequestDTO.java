package com.murilonerdx.bookmanager.model.book.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.ISBN;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookRequestDTO {

  private Long id;

  @NotNull @Size(max = 255) private String name;

  @NotNull private String isbn;

  @NotNull private Long publisherId;

  @NotNull private Long authorId;

  @NotNull @Max(3000) private Integer pages;

  @NotNull @Max(100) private Integer chapters;
}
