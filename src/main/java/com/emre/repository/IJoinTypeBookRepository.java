package com.emre.repository;

import com.emre.repository.entity.innerjoin.JoinTypeBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJoinTypeBookRepository extends JpaRepository<JoinTypeBook,Long> {

    @Query(value = "select t.id,t.type_name, b.book_name from tbltype as t \n" +
            "inner join tblbooktype as bt on t.id=bt.type_id\n" +
            "inner join tblbook as b on b.book_id=bt.book_id\n" +
            "where t.type_name=?1",nativeQuery = true)
    List<JoinTypeBook> enteredTypeBook(String typeName);
}
