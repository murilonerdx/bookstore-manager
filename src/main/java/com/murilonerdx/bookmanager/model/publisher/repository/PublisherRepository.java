package com.murilonerdx.bookmanager.model.publisher.repository;

import com.murilonerdx.bookmanager.model.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<User, Long> {}
