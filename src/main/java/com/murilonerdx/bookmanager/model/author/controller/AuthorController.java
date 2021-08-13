package com.murilonerdx.bookmanager.model.author.controller;

import com.murilonerdx.bookmanager.model.author.controller.docs.AuthorControllerDocs;
import com.murilonerdx.bookmanager.model.author.dto.AuthorDTO;
import com.murilonerdx.bookmanager.model.author.service.AuthorService;
import java.util.List;
import javax.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/authors")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class AuthorController implements AuthorControllerDocs {

  private final AuthorService authorService;

  @Override
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public AuthorDTO create(@RequestBody @Valid AuthorDTO authorDTO) {
    return authorService.create(authorDTO);
  }

  @GetMapping("/{name}")
  public AuthorDTO findByName(@PathVariable String name) {
    return authorService.findByName(name);
  }

  @GetMapping
  public List<AuthorDTO> findAll() {
    return authorService.findAll();
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void delete(@PathVariable Long id) {
    authorService.delete(id);
  }
}
