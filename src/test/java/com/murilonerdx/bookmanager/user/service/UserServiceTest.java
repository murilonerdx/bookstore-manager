package com.murilonerdx.bookmanager.user.service;

import com.murilonerdx.bookmanager.model.user.dto.MessageDTO;
import com.murilonerdx.bookmanager.model.user.dto.UserDTO;
import com.murilonerdx.bookmanager.model.user.entity.User;
import com.murilonerdx.bookmanager.model.user.exception.UserNotFoundException;
import com.murilonerdx.bookmanager.model.user.exceptions.UserAlreadyExistsException;
import com.murilonerdx.bookmanager.model.user.mapper.UserMapper;
import com.murilonerdx.bookmanager.model.user.repository.UserRepository;
import com.murilonerdx.bookmanager.model.user.service.UserService;
import com.murilonerdx.bookmanager.user.builder.UserDTOBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    private static final long INVALID_USER_ID = 2L;
    private final UserMapper userMapper = UserMapper.INSTANCE;

    @Mock
    private UserRepository userRepository;

    @Mock
    private PasswordEncoder passwordEncoder;

    @InjectMocks
    private UserService userService;

    private UserDTOBuilder userDTOBuilder;

    @BeforeEach
    void setUp() {
        userDTOBuilder = UserDTOBuilder.builder().build();
    }

    @Test
    void whenNewUserIsInformedThenItShouldBeCreated() {
        UserDTO expectedCreatedUserDTO = userDTOBuilder.buildUserDTO();
        User expectedCreatedUser = userMapper.toModel(expectedCreatedUserDTO);
        String expectedCreationMessage = "Username murilo with ID 1 successfully created";

        when(userRepository.findByEmailOrUsername(expectedCreatedUserDTO.getEmail(), expectedCreatedUserDTO.getUsername())).thenReturn(Optional.empty());
        when(passwordEncoder.encode(expectedCreatedUser.getPassword())).thenReturn(expectedCreatedUser.getPassword());
        when(userRepository.save(expectedCreatedUser)).thenReturn(expectedCreatedUser);

        MessageDTO creationMessage = userService.create(expectedCreatedUserDTO);

        assertThat(expectedCreationMessage, is(equalTo(creationMessage.getMessage())));
    }

    @Test
    void whenExistingUserIsInformedThenAnExceptionShouldBeThrown() {
        UserDTO expectedCreatedUserDTO = userDTOBuilder.buildUserDTO();
        User expectedCreatedUser = userMapper.toModel(expectedCreatedUserDTO);

        when(userRepository.findByEmailOrUsername(expectedCreatedUserDTO.getEmail(), expectedCreatedUserDTO.getUsername())).thenReturn(Optional.of(expectedCreatedUser));

        assertThrows(UserAlreadyExistsException.class, () -> userService.create(expectedCreatedUserDTO));
    }

    @Test
    void whenExistingUserIsInformedThenItShouldBeUpdated() {
        UserDTO expectedUpdatedUserDTO = userDTOBuilder.buildUserDTO();
        expectedUpdatedUserDTO.setUsername("Murilo Update");
        User expectedUpdatedUser = userMapper.toModel(expectedUpdatedUserDTO);
        String expectedUpdateMessage = "Username Murilo Update with ID 1 successfully updated";

        when(userRepository.findById(expectedUpdatedUser.getId())).thenReturn(Optional.of(expectedUpdatedUser));
        when(passwordEncoder.encode(expectedUpdatedUser.getPassword())).thenReturn(expectedUpdatedUser.getPassword());
        when(userRepository.save(expectedUpdatedUser)).thenReturn(expectedUpdatedUser);

        MessageDTO successUpdatedMessage = userService.update(expectedUpdatedUser.getId(), expectedUpdatedUserDTO);

        assertThat(successUpdatedMessage.getMessage(), is(equalTo(expectedUpdateMessage)));
    }

    @Test
    void whenNotFoundUserIsInformedThenAnExceptionShouldBeThrown() {
        UserDTO expectedUpdatedUserDTO = userDTOBuilder.buildUserDTO();
        expectedUpdatedUserDTO.setUsername("Murilo Update");
        expectedUpdatedUserDTO.setId(INVALID_USER_ID);

        when(userRepository.findById(expectedUpdatedUserDTO.getId())).thenReturn(Optional.empty());

        assertThrows(UserNotFoundException.class, () -> userService.update(INVALID_USER_ID, expectedUpdatedUserDTO));
    }

    @Test
    void whenValidUsernameIsInformedThenUserEntityShouldBeReturned() {
        UserDTO expectedFoundUserDTO = userDTOBuilder.buildUserDTO();
        User expectedFoundUser = userMapper.toModel(expectedFoundUserDTO);

        when(userRepository.findByUsername(expectedFoundUserDTO.getUsername()))
                .thenReturn(Optional.of(expectedFoundUser));

        User foundUser = userService.verifyAndGetUserIfExists(expectedFoundUserDTO.getUsername());

        assertThat(foundUser, is(equalTo(expectedFoundUser)));
    }

    @Test
    void whenInvalidUsernameIsInformedThenUserEntityShouldBeReturned() {
        UserDTO expectedFoundUserDTO = userDTOBuilder.buildUserDTO();

        when(userRepository.findByUsername(expectedFoundUserDTO.getUsername())).thenReturn(Optional.empty());

        assertThrows(UserNotFoundException.class,
                () -> userService.verifyAndGetUserIfExists(expectedFoundUserDTO.getUsername()));
    }

    @Test
    void whenValidUserIsInformedThenItShouldBeDeleted() {
        UserDTO expectedDeletedUserDTO = userDTOBuilder.buildUserDTO();
        User expectedDeletedUser = userMapper.toModel(expectedDeletedUserDTO);

        when(userRepository.findById(expectedDeletedUserDTO.getId())).thenReturn(Optional.of(expectedDeletedUser));
        doNothing().when(userRepository).deleteById(expectedDeletedUserDTO.getId());

        userService.delete(expectedDeletedUserDTO.getId());

        verify(userRepository, times(1)).deleteById(expectedDeletedUserDTO.getId());
    }

    @Test
    void whenInvalidUserIsInformedThenAnExceptionShouldBeThrown() {
        UserDTO expectedDeletedUserDTO = userDTOBuilder.buildUserDTO();

        when(userRepository.findById(expectedDeletedUserDTO.getId())).thenReturn(Optional.empty());

        assertThrows(UserNotFoundException.class, () -> userService.delete(expectedDeletedUserDTO.getId()));
    }
}
