package com.example.tp1.mapper;

import com.example.tp1.dto.ReservationDto;
import com.example.tp1.entities.Reservation;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReservationMapper {
    Reservation toEntity(ReservationDto reservationDto);
    ReservationDto toDto(Reservation reservation);
}
