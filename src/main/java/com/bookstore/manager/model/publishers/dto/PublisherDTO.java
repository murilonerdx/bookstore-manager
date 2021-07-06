package com.bookstore.manager.model.publishers.dto;

import com.bookstore.manager.model.books.entity.Book;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import java.time.LocalDate;
import java.util.List;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublisherDTO {
  private Long id;

  @NotEmpty
  @NotNull
  @Size(max=255)
  private String name;

  @NotEmpty
  @NotNull
  @Size(max=255)
  private String code;

  @NotNull
  @JsonFormat(shape= Shape.STRING, pattern="dd/MM/yyyy")
  private LocalDate foundationDate;

}
