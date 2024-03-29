package com.murilonerdx.bookmanager.model.author.dto;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDTO {

  private Long id;

  @NotNull @Size(max = 255) private String name;

  @NotNull @Max(120) private Integer age;
}
