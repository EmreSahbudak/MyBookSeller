package com.emre.service;

import com.emre.repository.IBookAuthorRepository;
import com.emre.repository.entity.BookAuthor;
import com.emre.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class BookAuthorService extends ServiceManager<BookAuthor,Long> {

    private final IBookAuthorRepository bookAuthorRepository;

    public BookAuthorService(IBookAuthorRepository bookAuthorRepository) {
        super(bookAuthorRepository);
        this.bookAuthorRepository = bookAuthorRepository;
    }
    public void save(Long authorId, Long bookId){
        save(BookAuthor.builder()
                .authorId(authorId)
                .bookId(bookId)
                .build());
    }
}
