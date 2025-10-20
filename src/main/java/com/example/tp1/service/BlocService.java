package com.example.tp1.service;

import com.example.tp1.dto.BlocDto;
import com.example.tp1.entities.Bloc;
import org.springframework.data.domain.Page;

public interface BlocService {
    BlocDto getBlocById(Long id);
    BlocDto updateBloc(BlocDto bloc);
    void deleteBloc(Long id);
    BlocDto addBloc(BlocDto bloc);
    Page<BlocDto> getAllBlocs(int page, int size);

}
