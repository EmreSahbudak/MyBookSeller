package com.emre.controller;

import com.emre.dto.request.SaveAuthorRequestDto;
import com.emre.repository.entity.Author;
import com.emre.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;

import static com.emre.constants.EndPointList.*;

@RestController
@RequestMapping(AUTHOR)
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService authorService;

    @PostMapping(SAVE)
    public ResponseEntity<Void> save(@RequestBody @Valid SaveAuthorRequestDto dto){
        authorService.save(dto);
        return ResponseEntity.ok().build();
    }
    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Author>> findAll(){
        return ResponseEntity.ok(authorService.findAll());
    }
}
