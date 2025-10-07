package com.example.tp1.dto;


import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Builder
public class FoyerDto {

    private Long idFoyer;
    private String nomFoyer;
    private String capaciteFoyer;

    private List<Long> blocsId;

    private Long universiteId ;

}
