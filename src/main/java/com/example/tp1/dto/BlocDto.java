package com.example.tp1.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Builder


public class BlocDto {
    private Long  id;
    private String nomBloc;
    private Long capaciteFoyer;


    private Long foyerId;
    private List<Long> chambresId ;

}
