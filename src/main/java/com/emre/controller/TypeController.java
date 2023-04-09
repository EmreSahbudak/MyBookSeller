package com.emre.controller;

import com.emre.dto.request.SaveTypeRequestDto;
import com.emre.repository.entity.Type;
import com.emre.repository.entity.innerjoin.JoinTypeBook;
import com.emre.service.TypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.emre.constants.EndPointList.*;
@RestController
@RequestMapping(TYPE)
@RequiredArgsConstructor
public class TypeController {

    private final TypeService typeService;

    @PostMapping(SAVE)
    public ResponseEntity<Void> save(@RequestBody SaveTypeRequestDto dto){
        typeService.save(dto);
        return  ResponseEntity.ok().build();
    }
    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Type>> findAll(){
        return ResponseEntity.ok(typeService.findAll());
    }
    @GetMapping("/entered-type-book")
    public ResponseEntity<List<JoinTypeBook>> enteredTypeBook(String typeName){
        return ResponseEntity.ok(typeService.enteredTypeBook(typeName));
    }
}
