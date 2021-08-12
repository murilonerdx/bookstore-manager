package com.murilonerdx.bookmanager.model.book.mapper;

import com.murilonerdx.bookmanager.model.book.dto.BookRequestDTO;
import com.murilonerdx.bookmanager.model.book.dto.BookResponseDTO;
import com.murilonerdx.bookmanager.model.book.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {

  BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

  Book toModel(BookRequestDTO bookRequestDTO);

  Book toModel(BookResponseDTO bookRequestDTO);

  BookResponseDTO toDTO(Book bookDTO);
}
