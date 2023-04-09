package com.emre.repository;

import com.emre.repository.entity.BookType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookTypeRepository extends JpaRepository<BookType,Long> {
}
