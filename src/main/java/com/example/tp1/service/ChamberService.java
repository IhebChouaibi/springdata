package com.example.tp1.service;

import com.example.tp1.dto.ChamberDto;
import org.springframework.data.domain.Page;

public interface ChamberService {
    ChamberDto getChamberById(Long id);
    ChamberDto updateChamber(ChamberDto chamber);
    void deleteChamber(Long id);
    ChamberDto addChamber(ChamberDto chamber);
    Page<ChamberDto> getAllChambres(int page, int size);
}
