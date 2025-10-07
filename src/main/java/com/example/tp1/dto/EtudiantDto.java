package com.example.tp1.dto;

import java.time.LocalDate;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

public class EtudiantDto {

    private Long idEdutiant;

    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;
    private LocalDate dateNaissance;

    private List<Long> reservationsId;
}
