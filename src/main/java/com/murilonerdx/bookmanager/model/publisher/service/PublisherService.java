package com.murilonerdx.bookmanager.model.publisher.service;

import com.murilonerdx.bookmanager.model.publisher.dto.PublisherDTO;
import com.murilonerdx.bookmanager.model.publisher.entity.Publisher;
import com.murilonerdx.bookmanager.model.publisher.exception.PublisherNotFoundException;
import com.murilonerdx.bookmanager.model.publisher.mapper.PublisherMapper;
import com.murilonerdx.bookmanager.model.publisher.repository.PublisherRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PublisherService {

    private final static PublisherMapper publisherMapper = PublisherMapper.INSTANCE;

    private final PublisherRepository publisherRepository;

    public PublisherDTO create(PublisherDTO publisherDTO) {
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
        return publisherRepository.findById(id)
                .orElseThrow(() -> new PublisherNotFoundException(id));
    }

    public void delete(Long id) {
        verifyAndGetIfExists(id);
        publisherRepository.deleteById(id);
    }

}