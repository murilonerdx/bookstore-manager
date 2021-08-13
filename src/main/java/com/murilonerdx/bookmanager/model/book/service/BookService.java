package com.murilonerdx.bookmanager.model.book.service;

import com.murilonerdx.bookmanager.model.author.service.AuthorService;
import com.murilonerdx.bookmanager.model.book.dto.BookRequestDTO;
import com.murilonerdx.bookmanager.model.book.dto.BookResponseDTO;
import com.murilonerdx.bookmanager.model.book.entity.Book;
import com.murilonerdx.bookmanager.model.book.exception.BookAlreadyExistsException;
import com.murilonerdx.bookmanager.model.book.exception.BookNotFoundException;
import com.murilonerdx.bookmanager.model.book.mapper.BookMapper;
import com.murilonerdx.bookmanager.model.book.repository.BookRepository;
import com.murilonerdx.bookmanager.model.publisher.service.PublisherService;
import com.murilonerdx.bookmanager.model.user.entity.User;
import com.murilonerdx.bookmanager.model.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BookService {

    private final BookRepository bookRepository;

    private final UserService userService;

    private final AuthorService authorService;

    private final PublisherService publisherService;

    private final BookMapper bookMapper = BookMapper.INSTANCE;

    private Book findByIdAndUser(Long bookId, User foundAuthenticatedUser) {
        return bookRepository.findByIdAndUser(bookId, foundAuthenticatedUser)
                .orElseThrow(() -> new BookNotFoundException(bookId));
    }

    private void verifyIfIsAlreadyRegistered(BookRequestDTO bookRequestDTO, User foundAuthenticatedUser) {
        bookRepository.findByNameAndIsbnAndUser(bookRequestDTO.getName(), bookRequestDTO.getIsbn(), foundAuthenticatedUser)
                .ifPresent(duplicatedBook -> {
                    throw new BookAlreadyExistsException(bookRequestDTO.getName(), bookRequestDTO.getIsbn(), foundAuthenticatedUser.getName());
                });
    }
}
