package com.murilonerdx.bookmanager.model.publisher.controller;

import com.murilonerdx.bookmanager.model.publisher.controller.docs.PublisherControllerDocs;
import com.murilonerdx.bookmanager.model.publisher.dto.PublisherDTO;
import com.murilonerdx.bookmanager.model.publisher.service.PublisherService;
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
@RequestMapping("/api/v1/publishers")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PublisherController implements PublisherControllerDocs {

  private PublisherService publisherService;

  @Override
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public PublisherDTO create(@RequestBody @Valid PublisherDTO publisherDTO) {
    return publisherService.create(publisherDTO);
  }

  @GetMapping
  public List<PublisherDTO> findAll() {
    return publisherService.findAll();
  }

  @GetMapping("/{id}")
  public PublisherDTO findById(@PathVariable Long id) {
    return publisherService.findById(id);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void delete(@PathVariable Long id) {
    publisherService.delete(id);
  }
}
