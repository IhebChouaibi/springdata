package com.example.tp1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.security.PrivateKey;
@Builder
@Getter
@Setter
@AllArgsConstructor

public class FullDetails {
    private Long idFoyer ;

    private String nomFoyer;
    private String capaciteFoyer;
    private String blocName;
    private String universiteName;
    private Long numeroChambre;
    private String typeChambre;
    private String etudiantName;


}
