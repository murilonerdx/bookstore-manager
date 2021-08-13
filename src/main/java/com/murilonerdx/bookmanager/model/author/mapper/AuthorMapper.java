package com.murilonerdx.bookmanager.model.author.mapper;

import com.murilonerdx.bookmanager.model.author.dto.AuthorDTO;
import com.murilonerdx.bookmanager.model.author.entity.Author;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper {

    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    Author toModel(AuthorDTO authorDTO);

    AuthorDTO toDTO(Author author);
}
