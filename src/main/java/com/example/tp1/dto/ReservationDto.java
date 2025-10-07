package com.example.tp1.dto;


import java.time.LocalDate;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ReservationDto {

    private Long idReservation;
    private LocalDate anneeUniversitaire;
    private Boolean estValide;

    private Long chambreId;

    private List<Long> etudiantsId;
}
