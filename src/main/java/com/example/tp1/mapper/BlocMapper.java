package com.example.tp1.mapper;

import com.example.tp1.dto.BlocDto;
import com.example.tp1.entities.Bloc;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BlocMapper {
    Bloc toEntity (BlocDto blocDto);
    @Mapping(source = "foyer.idFoyer" ,target = "foyerId")
    @Mapping(source = "chambres.id" ,target = "chambresId")
    BlocDto toDto(Bloc bloc);

}
