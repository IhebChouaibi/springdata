package com.example.tp1.service;

import com.example.tp1.entities.Etudiant;
import com.example.tp1.repositories.EtudiantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EtudiantServiceImpl implements EtudiantService {
    private final EtudiantRepository etudiantRepository;
    @Override
    public Etudiant getEtudiantById(Long id) {
        Etudiant etudiant= etudiantRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("wakkk"));
        return etudiant;
    }

    @Override
    public Etudiant getEtduiantByNom(String nom) {
        return null;
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return List.of();
    }
}
