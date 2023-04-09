package com.emre.repository;

import com.emre.repository.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IAuthorRepository extends JpaRepository<Author,Long> {

    Optional<Author> findOptionalByAuthorNameIgnoreCase(String name);
}
