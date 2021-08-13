package com.murilonerdx.bookmanager.model.user.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.murilonerdx.bookmanager.model.user.enums.Gender;
import com.murilonerdx.bookmanager.model.user.enums.Role;
import java.time.LocalDate;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Email;
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
public class UserDTO {

  private Long id;

  @NotNull @Size(max = 255) private String name;

  @NotNull @Max(120) private Integer age;

  @Enumerated(EnumType.STRING) @NotNull private Gender gender;

  @NotNull private String email;

  @NotNull private String username;

  @NotNull private String password;

  @NotNull
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
  private LocalDate birthdate;

  @Enumerated(EnumType.STRING) @NotNull private Role role;
}
