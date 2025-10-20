package com.example.tp1.repositories;

import com.example.tp1.entities.Etudiant;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    Etudiant findByNomEt(String nom);

}
