package com.emre.controller;

import com.emre.dto.request.SaveBookRequestDto;
import com.emre.repository.entity.Book;
import com.emre.repository.entity.innerjoin.JoinBookAuthor;
import com.emre.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.emre.constants.EndPointList.*;

@RestController
@RequestMapping(BOOK)
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Book>> findAll(){
        return ResponseEntity.ok(bookService.findAll());
    }
    @PostMapping(SAVE)
    public ResponseEntity<Book> save(@RequestBody SaveBookRequestDto dto){
        return ResponseEntity.ok(bookService.save(dto));
    }
    @GetMapping("/entered-book-name-author-name")
    public ResponseEntity<List<JoinBookAuthor>>
    enteredBookNameRequestAuthorNameStartingWith(String bookName){
        return ResponseEntity.ok(bookService.
                enteredBookNameRequestAuthorNameStartingWith(bookName));
    }





















}
