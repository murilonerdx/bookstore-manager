package com.murilonerdx.bookmanager.model.book.service;

import com.murilonerdx.bookmanager.model.author.service.AuthorService;
import com.murilonerdx.bookmanager.model.book.mapper.BookMapper;
import com.murilonerdx.bookmanager.model.book.repository.BookRepository;
import com.murilonerdx.bookmanager.model.publisher.service.PublisherService;
import com.murilonerdx.bookmanager.model.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BookService {

    private final BookRepository bookRepository;

    private final UserService userService;

    private final AuthorService authorService;

    private final PublisherService publisherService;

    private final BookMapper bookMapper = BookMapper.INSTANCE;

}
