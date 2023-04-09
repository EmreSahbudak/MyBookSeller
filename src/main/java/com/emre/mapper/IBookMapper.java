package com.emre.mapper;

import com.emre.dto.request.SaveBookRequestDto;
import com.emre.repository.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface IBookMapper {

    IBookMapper INSTANCE= Mappers.getMapper(IBookMapper.class);

    Book toBook(final SaveBookRequestDto dto);
}
