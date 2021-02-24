package com.bookstore.manager.model.author.service;

import com.bookstore.manager.model.author.dto.AuthorDTO;
import com.bookstore.manager.model.author.entity.Author;
import com.bookstore.manager.model.author.exception.AuthorNotFoundException;
import com.bookstore.manager.model.author.mapper.AuthorMapper;
import com.bookstore.manager.model.author.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class AuthorService {

    private final AuthorMapper authorMapper = AuthorMapper.INSTANCE;

    @Autowired
    private AuthorRepository repository;



    public AuthorDTO create(AuthorDTO authorDTO){
//        repository.findByName(authorDTO.getName()).ifPresent(author ->{throw new AuthorAlreadyExistsException(authorDTO.getName());});
        Author authorToCreate = authorMapper.toModel(authorDTO);
        Author createdAuthor = repository.save(authorToCreate);
        return authorMapper.toDTO(createdAuthor);
    }

    public AuthorDTO findById(Long id){
        Author foundAuthor = repository.findById(id).orElseThrow(() -> new AuthorNotFoundException(id));
        return authorMapper.toDTO(foundAuthor);
    }

    public List<AuthorDTO> findByAll(){
        return repository.findAll()
                .stream().map(authorMapper::toDTO).collect(Collectors.toList());
    }


}
