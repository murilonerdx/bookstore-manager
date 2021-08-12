package com.murilonerdx.bookmanager.model.user.repository;

import com.murilonerdx.bookmanager.model.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
