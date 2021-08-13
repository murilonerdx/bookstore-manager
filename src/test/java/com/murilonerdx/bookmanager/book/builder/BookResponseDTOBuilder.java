package com.murilonerdx.bookmanager.book.builder;

import com.murilonerdx.bookmanager.author.builder.AuthorDTOBuilder;
import com.murilonerdx.bookmanager.model.author.dto.AuthorDTO;
import com.murilonerdx.bookmanager.model.book.dto.BookResponseDTO;
import com.murilonerdx.bookmanager.model.publisher.dto.PublisherDTO;
import com.murilonerdx.bookmanager.model.user.dto.UserDTO;
import com.murilonerdx.bookmanager.publisher.builder.PublisherDTOBuilder;
import com.murilonerdx.bookmanager.user.builder.UserDTOBuilder;
import lombok.Builder;

@Builder
public class BookResponseDTOBuilder {

    @Builder.Default
    private final Long id = 1L;

    @Builder.Default
    private final String name = "Spring Boot Pro";

    @Builder.Default
    private final String isbn = "978-3-16-148410-0";

    @Builder.Default
    private final PublisherDTO publisher = PublisherDTOBuilder.builder().build().buildPublisherDTO();

    @Builder.Default
    private final AuthorDTO author = AuthorDTOBuilder.builder().build().buildAuthorDTO();

    @Builder.Default
    private final Integer pages = 200;

    @Builder.Default
    private final Integer chapters = 10;

    private final UserDTO userDTO = UserDTOBuilder.builder().build().buildUserDTO();

    public BookResponseDTO buildBookResponseDTO() {
        return new BookResponseDTO(id,
                name,
                isbn,
                publisher,
                author,
                pages,
                chapters);
    }
}
