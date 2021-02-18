package com.bookstore.manager.model.user.repository;

import com.bookstore.manager.model.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
