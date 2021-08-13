package com.murilonerdx.bookmanager.model.publisher.service;

import com.murilonerdx.bookmanager.model.publisher.dto.PublisherDTO;
import com.murilonerdx.bookmanager.model.publisher.entity.Publisher;
import com.murilonerdx.bookmanager.model.publisher.exception.PublisherAlreadyExistsException;
import com.murilonerdx.bookmanager.model.publisher.exception.PublisherNotFoundException;
import com.murilonerdx.bookmanager.model.publisher.mapper.PublisherMapper;
import com.murilonerdx.bookmanager.model.publisher.repository.PublisherRepository;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PublisherService {

  private final static PublisherMapper publisherMapper =
      PublisherMapper.INSTANCE;

  private final PublisherRepository publisherRepository;

  public PublisherDTO create(PublisherDTO publisherDTO) {
    verifyIfExists(publisherDTO.getName(), publisherDTO.getCode());
    Publisher publisherToCreate = publisherMapper.toModel(publisherDTO);
    Publisher createdPublisher = publisherRepository.save(publisherToCreate);
    return publisherMapper.toDTO(createdPublisher);
  }

  public List<PublisherDTO> findAll() {
    return publisherRepository.findAll()
        .stream()
        .map(publisherMapper::toDTO)
        .collect(Collectors.toList());
  }

  public PublisherDTO findById(Long id) {
    return publisherRepository.findById(id)
        .map(publisherMapper::toDTO)
        .orElseThrow(() -> new PublisherNotFoundException(id));
  }

  public Publisher verifyAndGetIfExists(Long id) {
    return publisherRepository.findById(id).orElseThrow(
        () -> new PublisherNotFoundException(id));
  }

  public void delete(Long id) {
    verifyAndGetIfExists(id);
    publisherRepository.deleteById(id);
  }

  private void verifyIfExists(String name, String code) {
    Optional<Publisher> duplicatedPublisher =
        publisherRepository.findByNameOrCode(name, code);
    if (duplicatedPublisher.isPresent()) {
      throw new PublisherAlreadyExistsException(name, code);
    }
  }
}
