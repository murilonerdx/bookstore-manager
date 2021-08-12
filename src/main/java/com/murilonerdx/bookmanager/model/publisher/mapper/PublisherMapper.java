package com.murilonerdx.bookmanager.model.publisher.mapper;

import com.murilonerdx.bookmanager.model.publisher.dto.PublisherDTO;
import com.murilonerdx.bookmanager.model.publisher.entity.Publisher;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PublisherMapper {

  PublisherMapper INSTANCE = Mappers.getMapper(PublisherMapper.class);

  Publisher toModel(PublisherDTO publisherDTO);

  PublisherDTO toDTO(Publisher publisher);
}