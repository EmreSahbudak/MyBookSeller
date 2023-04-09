
# MyBookSeller

The Mybookseller project is an application on a book sales platform where the user can register and view books,

- Displaying author names according to the selected book
- Filtering the books according to the selected type and displaying them to the user
- Book registration can be done on a simple HTML screen and the type, author, publisher information on this screen is pulled from the database. 


## Technologies

- JAVA
- Spring Boot 
- Monolithic Architecture
- PostgreSQL
- HTML&CSS




  
## Kullanım/Örnekler

-Sample code for data extraction using join in different tables with Native SQL

```java
 @Query(value = "select b.book_id,b.book_name, a.author_name from tblbook as b \n" +
            "inner join tblbookauthor as ba on b.book_id=ba.book_id\n" +
            "inner join tblauthor as a on a.author_id=ba.author_id\n" +
            "where b.book_name=?1", nativeQuery = true)
    List<JoinBookAuthor> enteredBookNameRequestAuthorNameStartingWith(String bookName);
```

  
