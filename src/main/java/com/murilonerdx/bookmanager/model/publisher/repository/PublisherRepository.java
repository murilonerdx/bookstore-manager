package com.murilonerdx.bookmanager.model.publisher.repository;

import com.murilonerdx.bookmanager.model.publisher.entity.Publisher;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
  Optional<Publisher> findByNameOrCode(String name, String code);
}
