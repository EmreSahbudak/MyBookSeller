package com.emre.mapper;

import com.emre.dto.request.SavePublisherRequestDto;
import com.emre.repository.entity.Publisher;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface IPublisherMapper {

    IPublisherMapper INSTANCE= Mappers.getMapper(IPublisherMapper.class);

    Publisher toPublisher(final SavePublisherRequestDto dto);
}
