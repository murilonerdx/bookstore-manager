package com.murilonerdx.bookmanager.model.book.controller;

import com.murilonerdx.bookmanager.model.book.controller.docs.BookControllerDocs;
import com.murilonerdx.bookmanager.model.book.dto.BookRequestDTO;
import com.murilonerdx.bookmanager.model.book.dto.BookResponseDTO;
import com.murilonerdx.bookmanager.model.book.service.BookService;
import com.murilonerdx.bookmanager.model.user.dto.AuthenticatedUser;
import java.util.List;
import javax.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BookController implements BookControllerDocs {

  private final BookService bookService;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public BookResponseDTO
  create(@AuthenticationPrincipal AuthenticatedUser authenticatedUser,
         @RequestBody @Valid BookRequestDTO bookRequestDTO) {
    return bookService.create(authenticatedUser, bookRequestDTO);
  }

  @GetMapping("/{id}")
  public BookResponseDTO
  findByIdAndUser(@AuthenticationPrincipal AuthenticatedUser authenticatedUser,
                  @PathVariable Long id) {
    return bookService.findByIdAndUser(authenticatedUser, id);
  }

  @GetMapping
  public List<BookResponseDTO>
  findAllByUser(@AuthenticationPrincipal AuthenticatedUser authenticatedUser) {
    return bookService.findAllByUser(authenticatedUser);
  }

  @PutMapping("/{id}")
  public BookResponseDTO
  updateByUser(@AuthenticationPrincipal AuthenticatedUser authenticatedUser,
               @PathVariable Long id,
               @RequestBody @Valid BookRequestDTO bookRequestDTO) {
    return bookService.updateByUser(authenticatedUser, id, bookRequestDTO);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void deleteByIdAndUser(@AuthenticationPrincipal AuthenticatedUser
                                    authenticatedUser,
                                @PathVariable Long id) {
    bookService.deleteByIdAndUser(authenticatedUser, id);
  }
}