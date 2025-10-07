package com.example.tp1.service;

import com.example.tp1.entities.Etudiant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EtudiantServiceImpl implements EtudiantService {
    @Override
    public Etudiant getEtudiantById(Long id) {
        return null;
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
