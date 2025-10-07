package com.example.tp1.mapper;

import com.example.tp1.dto.ChamberDto;
import com.example.tp1.entities.Chambre;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ChambreMapper {
Chambre toEntity (ChamberDto chamberDto);
ChamberDto toDto(Chambre chamber);


}
