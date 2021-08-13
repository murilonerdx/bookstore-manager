package com.murilonerdx.bookmanager.model.user.repository;

import com.murilonerdx.bookmanager.model.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    Optional<User> findByEmailOrUsername(String email, String username);
}
