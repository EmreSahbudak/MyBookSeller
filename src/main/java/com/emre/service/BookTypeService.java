package com.emre.service;

import com.emre.repository.IBookTypeRepository;
import com.emre.repository.entity.BookType;
import com.emre.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class BookTypeService extends ServiceManager<BookType,Long> {

    private final IBookTypeRepository bookTypeRepository;

    public BookTypeService(IBookTypeRepository bookTypeRepository) {
        super(bookTypeRepository);
        this.bookTypeRepository = bookTypeRepository;
    }
    public void save(Long typeId,Long bookId){
        save(BookType.builder()
                .typeId(typeId)
                .bookId(bookId)
                .build());
    }
}
