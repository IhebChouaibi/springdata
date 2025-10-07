package com.example.tp1.mapper;

import com.example.tp1.dto.FoyerDto;
import com.example.tp1.entities.Foyer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FoyerMapper {
    Foyer toEntity(FoyerDto foyerDto);
    FoyerDto toDto(Foyer foyer);
}
