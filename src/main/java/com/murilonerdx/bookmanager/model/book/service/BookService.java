package com.murilonerdx.bookmanager.model.book.service;

import com.murilonerdx.bookmanager.model.author.entity.Author;
import com.murilonerdx.bookmanager.model.author.service.AuthorService;
import com.murilonerdx.bookmanager.model.book.dto.BookRequestDTO;
import com.murilonerdx.bookmanager.model.book.dto.BookResponseDTO;
import com.murilonerdx.bookmanager.model.book.entity.Book;
import com.murilonerdx.bookmanager.model.book.exception.BookAlreadyExistsException;
import com.murilonerdx.bookmanager.model.book.exception.BookNotFoundException;
import com.murilonerdx.bookmanager.model.book.mapper.BookMapper;
import com.murilonerdx.bookmanager.model.book.repository.BookRepository;
import com.murilonerdx.bookmanager.model.publisher.entity.Publisher;
import com.murilonerdx.bookmanager.model.publisher.service.PublisherService;
import com.murilonerdx.bookmanager.model.user.dto.AuthenticatedUser;
import com.murilonerdx.bookmanager.model.user.entity.User;
import com.murilonerdx.bookmanager.model.user.service.UserService;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BookService {

  private final BookRepository bookRepository;

  private final UserService userService;

  private final AuthorService authorService;

  private final PublisherService publisherService;

  private final BookMapper bookMapper = BookMapper.INSTANCE;

  public BookResponseDTO create(AuthenticatedUser authenticatedUser,
                                BookRequestDTO bookRequestDTO) {
    User foundAuthenticatedUser =
        userService.verifyAndGetUserIfExists(authenticatedUser.getUsername());
    verifyIfIsAlreadyRegistered(bookRequestDTO, foundAuthenticatedUser);
    Author foundAuthor =
        authorService.verifyAndGetIfExists(bookRequestDTO.getAuthorId());
    Publisher foundPublisher =
        publisherService.verifyAndGetIfExists(bookRequestDTO.getPublisherId());

    Book bookToSave = bookMapper.toModel(bookRequestDTO);
    bookToSave.setUser(foundAuthenticatedUser);
    bookToSave.setAuthor(foundAuthor);
    bookToSave.setPublisher(foundPublisher);
    Book savedBook = bookRepository.save(bookToSave);
    return bookMapper.toDTO(savedBook);
  }

  public BookResponseDTO findByIdAndUser(AuthenticatedUser authenticatedUser,
                                         Long bookId) {
    User foundAuthenticatedUser =
        userService.verifyAndGetUserIfExists(authenticatedUser.getUsername());
    return bookRepository.findByIdAndUser(bookId, foundAuthenticatedUser)
        .map(bookMapper::toDTO)
        .orElseThrow(() -> new BookNotFoundException(bookId));
  }

  public List<BookResponseDTO>
  findAllByUser(AuthenticatedUser authenticatedUser) {
    User foundAuthenticatedUser =
        userService.verifyAndGetUserIfExists(authenticatedUser.getUsername());
    return bookRepository.findAllByUser(foundAuthenticatedUser)
        .stream()
        .map(bookMapper::toDTO)
        .collect(Collectors.toList());
  }

  public BookResponseDTO updateByUser(AuthenticatedUser authenticatedUser,
                                      Long bookId,
                                      BookRequestDTO bookRequestDTO) {
    User foundAuthenticatedUser =
        userService.verifyAndGetUserIfExists(authenticatedUser.getUsername());
    Book foundBook = findByIdAndUser(bookId, foundAuthenticatedUser);

    Author foundAuthor =
        authorService.verifyAndGetIfExists(bookRequestDTO.getAuthorId());
    Publisher foundPublisher =
        publisherService.verifyAndGetIfExists(bookRequestDTO.getPublisherId());

    Book bookToUpdate = bookMapper.toModel(bookRequestDTO);
    bookToUpdate.setId(foundBook.getId());
    bookToUpdate.setUser(foundAuthenticatedUser);
    bookToUpdate.setAuthor(foundAuthor);
    bookToUpdate.setPublisher(foundPublisher);
    bookToUpdate.setCreatedBy(foundBook.getCreatedBy());
    bookToUpdate.setCreatedDate(foundBook.getCreatedDate());
    Book savedBook = bookRepository.save(bookToUpdate);
    return bookMapper.toDTO(savedBook);
  }

  @Transactional
  public void deleteByIdAndUser(AuthenticatedUser authenticatedUser,
                                Long bookId) {
    User foundAuthenticatedUser =
        userService.verifyAndGetUserIfExists(authenticatedUser.getUsername());
    Book foundBookToDelete = findByIdAndUser(bookId, foundAuthenticatedUser);
    bookRepository.deleteByIdAndUser(foundBookToDelete.getId(),
                                     foundAuthenticatedUser);
  }

  private Book findByIdAndUser(Long bookId, User foundAuthenticatedUser) {
    return bookRepository.findByIdAndUser(bookId, foundAuthenticatedUser)
        .orElseThrow(() -> new BookNotFoundException(bookId));
  }

  private void verifyIfIsAlreadyRegistered(BookRequestDTO bookRequestDTO,
                                           User foundAuthenticatedUser) {
    bookRepository
        .findByNameAndIsbnAndUser(bookRequestDTO.getName(),
                                  bookRequestDTO.getIsbn(),
                                  foundAuthenticatedUser)
        .ifPresent(duplicatedBook -> {
          throw new BookAlreadyExistsException(
              bookRequestDTO.getName(), bookRequestDTO.getIsbn(),
              foundAuthenticatedUser.getName());
        });
  }
}
