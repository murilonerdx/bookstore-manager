package com.murilonerdx.bookmanager.model.book.dto;

import com.murilonerdx.bookmanager.model.author.dto.AuthorDTO;
import com.murilonerdx.bookmanager.model.publisher.dto.PublisherDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookResponseDTO {

  private Long id;

  private String name;

  private String isbn;

  private PublisherDTO publisher;

  private AuthorDTO author;

  private Integer pages;

  private Integer chapters;
}
