package com.murilonerdx.bookmanager.model.publisher.repository;

import com.murilonerdx.bookmanager.model.publisher.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
    Optional<Publisher> findByNameOrCode(String name, String code);
}
