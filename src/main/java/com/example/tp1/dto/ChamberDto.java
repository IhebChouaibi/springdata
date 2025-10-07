package com.example.tp1.dto;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ChamberDto {

    private Long idChambre;
    private Long numeroChambre;

    private String tipoChambre;

    private Long blocId ;


    private List<Long> reservationsId;
}
