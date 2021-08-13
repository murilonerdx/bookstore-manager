package com.murilonerdx.bookmanager.model.user.service;

import com.murilonerdx.bookmanager.model.user.dto.MessageDTO;
import com.murilonerdx.bookmanager.model.user.entity.User;
import com.murilonerdx.bookmanager.model.user.exception.UserNotFoundException;
import com.murilonerdx.bookmanager.model.user.exceptions.UserAlreadyExistsException;
import com.murilonerdx.bookmanager.model.user.mapper.UserMapper;
import com.murilonerdx.bookmanager.model.user.repository.UserRepository;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {

  private final static UserMapper userMapper = UserMapper.INSTANCE;

  private final UserRepository userRepository;

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
}
