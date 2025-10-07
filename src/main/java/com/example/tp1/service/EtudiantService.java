package com.example.tp1.service;

import com.example.tp1.entities.Etudiant;

import java.util.List;

public interface EtudiantService {
    Etudiant getEtudiantById(Long id);
    Etudiant getEtduiantByNom(String nom);
    List<Etudiant> getAllEtudiants();

}
