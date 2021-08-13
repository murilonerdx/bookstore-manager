package com.murilonerdx.bookmanager.model.publisher.repository;

import com.murilonerdx.bookmanager.model.publisher.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
