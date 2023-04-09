package com.emre.controller;

import com.emre.dto.request.SavePublisherRequestDto;
import com.emre.repository.entity.Publisher;
import com.emre.service.PublisherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;

import static com.emre.constants.EndPointList.*;
@RestController
@RequestMapping(PUBLISHER)
@RequiredArgsConstructor
public class PublisherController {

    private final PublisherService publisherService;

    @PostMapping(SAVE)
    public ResponseEntity<Void> save(@RequestBody @Valid SavePublisherRequestDto dto){
        publisherService.save(dto);
        return ResponseEntity.ok().build();
    }
    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Publisher>> findAll(){
        return ResponseEntity.ok(publisherService.findAll());
    }
}
