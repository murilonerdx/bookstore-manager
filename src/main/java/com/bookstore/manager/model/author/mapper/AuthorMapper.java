package com.bookstore.manager.model.author.mapper;


import com.bookstore.manager.model.author.dto.AuthorDTO;
import com.bookstore.manager.model.author.entity.Author;
import org.mapstruct.Mapper;

import java.util.ServiceLoader;

@Mapper
public interface AuthorMapper {

    ServiceLoader<AuthorMapper> INSTANCE = ServiceLoader.load(AuthorMapper.class);

    Author toModel(AuthorDTO authorDTO);

    AuthorDTO toDTO(Author author);
}
