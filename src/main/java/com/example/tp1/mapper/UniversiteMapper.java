package com.example.tp1.mapper;

import com.example.tp1.dto.UniversiteDto;
import com.example.tp1.entities.Universite;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UniversiteMapper {
    Universite toEntity (UniversiteDto universiteDto);
    UniversiteDto toDto(Universite universite);


}
