package com.example.tp1.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UniversiteDto {

    private Long idUniversite;
    private String nomUniversite;
    private String adresse;
    private Long foyerId  ;
}
