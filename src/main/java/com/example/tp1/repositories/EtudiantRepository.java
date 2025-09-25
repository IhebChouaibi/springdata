package com.example.tp1.repositories;

import com.example.tp1.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Universite,Long> {
}
