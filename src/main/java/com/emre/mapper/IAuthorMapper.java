package com.emre.mapper;

import com.emre.dto.request.SaveAuthorRequestDto;
import com.emre.repository.entity.Author;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface IAuthorMapper {

    IAuthorMapper INSTANCE= Mappers.getMapper(IAuthorMapper.class);

    Author toAuthor(final SaveAuthorRequestDto dto);
}
