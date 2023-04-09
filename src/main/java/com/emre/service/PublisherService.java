package com.emre.service;

import com.emre.dto.request.SavePublisherRequestDto;
import com.emre.mapper.IPublisherMapper;
import com.emre.repository.IPublisherRepository;
import com.emre.repository.entity.Publisher;
import com.emre.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PublisherService extends ServiceManager<Publisher,Long> {

    private final IPublisherRepository publisherRepository;

    public PublisherService(IPublisherRepository publisherRepository) {
        super(publisherRepository);
        this.publisherRepository = publisherRepository;
    }

    public void save(SavePublisherRequestDto dto){
        Optional<Publisher> publisher=publisherRepository.
                findOptionalByPublisherNameIgnoreCase(dto.getPublisherName());
        if (publisher.isEmpty()){
            save(IPublisherMapper.INSTANCE.toPublisher(dto));
        }
    }
}
