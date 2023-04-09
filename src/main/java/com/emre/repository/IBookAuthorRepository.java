package com.emre.repository;

import com.emre.repository.entity.BookAuthor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookAuthorRepository extends JpaRepository<BookAuthor,Long> {
}
