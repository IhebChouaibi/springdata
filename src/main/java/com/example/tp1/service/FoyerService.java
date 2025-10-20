package com.example.tp1.service;

import com.example.tp1.dto.FoyerDto;
import com.example.tp1.dto.FullDetails;
import com.example.tp1.entities.Foyer;
import org.springframework.data.domain.Page;

public interface FoyerService {
    FoyerDto getFoyerById(Long id);
    FoyerDto updateFoyer(FoyerDto foyer);
    void deleteFoyer(Long id);
    FoyerDto addFoyer(FoyerDto foyer);
    Page<FoyerDto> getAllFoyers(int page, int size);

    //FoyerDto getFullDetails(Long id);

}
