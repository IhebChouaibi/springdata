package com.example.tp1.service;

import com.example.tp1.dto.EtudiantDto;
import com.example.tp1.entities.Etudiant;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EtudiantService {
    EtudiantDto getEtudiantById(Long id);
    EtudiantDto getEtduiantByNom(String nom);
    Page<EtudiantDto> getAllEtudiants(int page, int size);
    Page<EtudiantDto> getAllEtudiantsBy(String nom, int page, int size);


}
