package com.example.tp1.repositories;

import com.example.tp1.dto.FoyerDto;
import com.example.tp1.entities.Foyer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface FulldetailsMapper {
    @Mappings({
            @Mapping(source = "foyer.idFoyer" ,target = "foyerId"),
            @Mapping(source = "universite.nomUniversite" ,target = "nomUniversite"),
            @Mapping(source = "chambres.numeroChambre" ,target = "numeroChambre")

    })
    FoyerDto toFoyerDto(Foyer foyer);
    Foyer toFoyer(FoyerDto foyerDto);
}
