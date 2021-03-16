package com.bookstore.manager.model.author.mapper;

import com.bookstore.manager.model.author.dto.AuthorDTO;
import com.bookstore.manager.model.author.entity.Author;
import com.bookstore.manager.model.books.entity.Book;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-02-24T18:07:09-0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.9 (Oracle Corporation)"
)
public class AuthorMapperImpl implements AuthorMapper {

    @Override
    public Author toModel(AuthorDTO authorDTO) {
        if ( authorDTO == null ) {
            return null;
        }

        Author author = new Author();

        author.setId( authorDTO.getId() );
        author.setName( authorDTO.getName() );
        author.setAge( authorDTO.getAge() );
        List<Book> list = authorDTO.getBooks();
        if ( list != null ) {
            author.setBooks( new ArrayList<Book>( list ) );
        }

        return author;
    }

    @Override
    public AuthorDTO toDTO(Author author) {
        if ( author == null ) {
            return null;
        }

        AuthorDTO authorDTO = new AuthorDTO();

        authorDTO.setId( author.getId() );
        authorDTO.setName( author.getName() );
        authorDTO.setAge( author.getAge() );
        List<Book> list = author.getBooks();
        if ( list != null ) {
            authorDTO.setBooks( new ArrayList<Book>( list ) );
        }

        return authorDTO;
    }
}
