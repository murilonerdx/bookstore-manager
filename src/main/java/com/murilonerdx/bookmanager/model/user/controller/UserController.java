package com.murilonerdx.bookmanager.model.user.controller;

import com.murilonerdx.bookmanager.model.user.controller.docs.UserControllerDocs;
import com.murilonerdx.bookmanager.model.user.dto.JwtResponse;
import com.murilonerdx.bookmanager.model.user.dto.MessageDTO;
import com.murilonerdx.bookmanager.model.user.dto.UserDTO;
import com.murilonerdx.bookmanager.model.user.service.AuthenticationService;
import com.murilonerdx.bookmanager.model.user.service.JwtRequest;
import com.murilonerdx.bookmanager.model.user.service.UserService;
import javax.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UserController implements UserControllerDocs {

  private final UserService userService;

  private final AuthenticationService authenticationService;

  @Override
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public MessageDTO create(@RequestBody @Valid UserDTO userToSaveDTO) {
    return userService.create(userToSaveDTO);
  }

  @PostMapping(value = "/authenticate")
  public JwtResponse
  createAuthenticationToken(@RequestBody @Valid JwtRequest jwtRequest) {
    return authenticationService.createAuthenticationToken(jwtRequest);
  }

  @PutMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public MessageDTO update(@PathVariable Long id,
                           @RequestBody @Valid UserDTO userToUpdateDTO) {
    return userService.update(id, userToUpdateDTO);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void delete(@PathVariable Long id) {
    userService.delete(id);
  }
}
