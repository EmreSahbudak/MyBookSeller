package com.emre.mapper;

import com.emre.dto.request.SaveTypeRequestDto;
import com.emre.repository.entity.Type;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ITypeMapper {

    ITypeMapper INSTANCE= Mappers.getMapper(ITypeMapper.class);

    Type toType(final SaveTypeRequestDto dto);
}
