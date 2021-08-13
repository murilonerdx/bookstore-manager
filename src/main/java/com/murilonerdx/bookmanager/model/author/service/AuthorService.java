package com.murilonerdx.bookmanager.model.author.service;

import com.murilonerdx.bookmanager.model.author.dto.AuthorDTO;
import com.murilonerdx.bookmanager.model.author.entity.Author;
import com.murilonerdx.bookmanager.model.author.exception.AuthorNotFoundException;
import com.murilonerdx.bookmanager.model.author.mapper.AuthorMapper;
import com.murilonerdx.bookmanager.model.author.repository.AuthorRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class AuthorService {

  private final static AuthorMapper authorMapper = AuthorMapper.INSTANCE;

  private final AuthorRepository authorRepository;

  public AuthorDTO create(AuthorDTO authorDTO) {
    Author authorToCreate = authorMapper.toModel(authorDTO);
    Author createdAuthor = authorRepository.save(authorToCreate);
    return authorMapper.toDTO(createdAuthor);
  }

  public List<AuthorDTO> findAll() {
    return authorRepository.findAll()
        .stream()
        .map(authorMapper::toDTO)
        .collect(Collectors.toList());
  }

  public Author verifyAndGetIfExists(Long id) {
    return authorRepository.findById(id).orElseThrow(
        () -> new AuthorNotFoundException(id));
  }

  public void delete(Long id) {
    verifyAndGetIfExists(id);
    authorRepository.deleteById(id);
  }
}
