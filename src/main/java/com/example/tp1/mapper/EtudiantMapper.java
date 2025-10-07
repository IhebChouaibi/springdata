package com.example.tp1.mapper;

import com.example.tp1.dto.EtudiantDto;
import com.example.tp1.entities.Etudiant;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EtudiantMapper {
    Etudiant toEntity(EtudiantDto etudiantDto);

    EtudiantDto toDto(Etudiant etudiant);

}

