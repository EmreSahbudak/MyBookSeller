package com.emre.repository;

import com.emre.repository.entity.Book;
import com.emre.repository.entity.innerjoin.JoinBookAuthor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJoinBookAuthorRepository extends JpaRepository<JoinBookAuthor,Long> {

    @Query(value = "select b.book_id,b.book_name, a.author_name from tblbook as b \n" +
            "inner join tblbookauthor as ba on b.book_id=ba.book_id\n" +
            "inner join tblauthor as a on a.author_id=ba.author_id\n" +
            "where b.book_name=?1", nativeQuery = true)
    List<JoinBookAuthor> enteredBookNameRequestAuthorNameStartingWith(String bookName);
}
