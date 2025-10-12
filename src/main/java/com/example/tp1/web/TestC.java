package com.example.tp1.web;

import com.example.tp1.entities.Etudiant;
import com.example.tp1.repositories.EtudiantRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestC {
    private final EtudiantRepository etudiantRepository;

    @GetMapping("/test/{id}")
    public Etudiant getEtudiantById(@PathVariable Long id) {
        Etudiant etudiant= etudiantRepository.findById(id).orElseThrow(()-> new RuntimeException("wakkk"));
        return etudiant;
    }



}
