package com.emre.service;

import com.emre.dto.request.SaveAuthorRequestDto;
import com.emre.mapper.IAuthorMapper;
import com.emre.repository.IAuthorRepository;
import com.emre.repository.entity.Author;
import com.emre.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorService extends ServiceManager<Author,Long> {

    private final IAuthorRepository authorRepository;

    public AuthorService(IAuthorRepository authorRepository) {
        super(authorRepository);
        this.authorRepository = authorRepository;
    }
    public void save(SaveAuthorRequestDto dto){
        Optional<Author> author=authorRepository.findOptionalByAuthorNameIgnoreCase(dto.getAuthorName());
        if (author.isEmpty()){
            save(IAuthorMapper.INSTANCE.toAuthor(dto));
        }
    }
}
