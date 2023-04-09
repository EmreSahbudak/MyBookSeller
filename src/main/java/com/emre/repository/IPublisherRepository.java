package com.emre.repository;

import com.emre.repository.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IPublisherRepository extends JpaRepository<Publisher, Long> {

    Optional<Publisher> findOptionalByPublisherNameIgnoreCase(String name);
}
