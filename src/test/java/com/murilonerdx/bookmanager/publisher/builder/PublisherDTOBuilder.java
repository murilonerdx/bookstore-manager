package com.murilonerdx.bookmanager.publisher.builder;

import com.murilonerdx.bookmanager.model.publisher.dto.PublisherDTO;
import java.time.LocalDate;
import lombok.Builder;

@Builder
public class PublisherDTOBuilder {

  @Builder.Default private final Long id = 1L;

  @Builder.Default private final String name = "Murilo Pereira";

  @Builder.Default private final String code = "PUB2020";

  @Builder.Default
  private final LocalDate foundationDate = LocalDate.of(2020, 6, 1);

  public PublisherDTO buildPublisherDTO() {
    return new PublisherDTO(id, name, code, foundationDate);
  }
}
