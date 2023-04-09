package com.emre.service;

import com.emre.dto.request.SaveBookRequestDto;
import com.emre.mapper.IBookMapper;
import com.emre.repository.IBookRepository;
import com.emre.repository.IJoinBookAuthorRepository;
import com.emre.repository.entity.Book;
import com.emre.repository.entity.innerjoin.JoinBookAuthor;
import com.emre.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService extends ServiceManager<Book,Long> {

    private final IBookRepository bookRepository;
    private final BookAuthorService bookAuthorService;
    private final BookTypeService bookTypeService;
    private final IJoinBookAuthorRepository joinBookAuthorRepository;

    public BookService(IBookRepository bookRepository,
                       BookAuthorService bookAuthorService,
                       BookTypeService bookTypeService,
                       IJoinBookAuthorRepository joinBookAuthorRepository) {
        super(bookRepository);
        this.bookRepository = bookRepository;
        this.bookAuthorService = bookAuthorService;
        this.bookTypeService = bookTypeService;
        this.joinBookAuthorRepository = joinBookAuthorRepository;
    }

    public Book save(SaveBookRequestDto dto){
        Book book=save(IBookMapper.INSTANCE.toBook(dto));

        dto.getAuthorIds().forEach(yazarId->{
            bookAuthorService.save(yazarId, book.getBookId());
        });
        dto.getTypeIds().forEach(typeId->{
            bookTypeService.save(typeId, book.getBookId());
        });
        return book;
    }
    public List<JoinBookAuthor> enteredBookNameRequestAuthorNameStartingWith
            (String bookName){
        return joinBookAuthorRepository.
                enteredBookNameRequestAuthorNameStartingWith(bookName);
    }
}
