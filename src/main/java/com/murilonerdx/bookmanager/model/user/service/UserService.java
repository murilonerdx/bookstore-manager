package com.murilonerdx.bookmanager.model.user.service;

import com.murilonerdx.bookmanager.model.user.dto.MessageDTO;
import com.murilonerdx.bookmanager.model.user.dto.UserDTO;
import com.murilonerdx.bookmanager.model.user.entity.User;
import com.murilonerdx.bookmanager.model.user.exception.UserAlreadyExistsException;
import com.murilonerdx.bookmanager.model.user.exception.UserNotFoundException;
import com.murilonerdx.bookmanager.model.user.mapper.UserMapper;
import com.murilonerdx.bookmanager.model.user.repository.UserRepository;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {

  private final static UserMapper userMapper = UserMapper.INSTANCE;

  private final UserRepository userRepository;

  private final PasswordEncoder passwordEncoder;

  public MessageDTO create(UserDTO userToCreateDTO) {
    verifyIfExists(userToCreateDTO.getEmail(), userToCreateDTO.getUsername());
    User userToCreate = userMapper.toModel(userToCreateDTO);
    userToCreate.setPassword(
        passwordEncoder.encode(userToCreate.getPassword()));
    User createdUser = userRepository.save(userToCreate);
    return creationMessage(createdUser);
  }

  public MessageDTO update(Long id, UserDTO userToUpdateDTO) {
    User foundUser = verifyAndGetIfExists(id);

    userToUpdateDTO.setId(id);
    User userToUpdate = userMapper.toModel(userToUpdateDTO);
    userToUpdate.setPassword(
        passwordEncoder.encode(userToUpdate.getPassword()));

    userToUpdate.setCreatedDate(foundUser.getCreatedDate());
    userToUpdate.setCreatedBy(foundUser.getCreatedBy());

    User updatedUser = userRepository.save(userToUpdate);
    return updateMessage(updatedUser);
  }

  public User verifyAndGetUserIfExists(String username) {
    return userRepository.findByUsername(username).orElseThrow(
        () -> new UserNotFoundException(username));
  }

  public void delete(Long id) {
    verifyAndGetIfExists(id);
    userRepository.deleteById(id);
  }

  private User verifyAndGetIfExists(Long id) {
    return userRepository.findById(id).orElseThrow(
        () -> new UserNotFoundException(id));
  }

  private void verifyIfExists(String email, String username) {
    Optional<User> foundUser =
        userRepository.findByEmailOrUsername(email, username);
    if (foundUser.isPresent()) {
      throw new UserAlreadyExistsException(email, username);
    }
  }

  private MessageDTO creationMessage(User createdUser) {
    return returnMessage("created", createdUser);
  }

  private MessageDTO updateMessage(User updatedUser) {
    return returnMessage("updated", updatedUser);
  }

  private MessageDTO returnMessage(String action, User user) {
    return MessageDTO.builder()
        .message(String.format("Username %s with ID %s successfully %s",
                               user.getUsername(), user.getId(), action))
        .build();
  }
}
