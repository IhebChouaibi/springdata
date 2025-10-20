package com.example.tp1.service;

import com.example.tp1.dto.EtudiantDto;
import com.example.tp1.entities.Etudiant;
import com.example.tp1.mapper.EtudiantMapper;
import com.example.tp1.repositories.EtudiantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EtudiantServiceImpl implements EtudiantService {
    private final EtudiantRepository etudiantRepository;
    private final EtudiantMapper etudiantMapper;
    @Override
    public EtudiantDto getEtudiantById(Long id) {
        Etudiant etudiant= findById(id);
        return etudiantMapper.toDto(etudiant);
    }

    @Override
    public EtudiantDto getEtduiantByNom(String nom) {
        Etudiant etud = etudiantRepository.findByNomEt(nom);
        if (etud!=null){
            return etudiantMapper.toDto(etud);
        }
        return null;



    }

    @Override
    public Page<EtudiantDto> getAllEtudiants(int page, int size) {
        return null;
    }

    @Override
    public Page<EtudiantDto> getAllEtudiantsBy(String nom, int page, int size) {
        return null;
    }


    public Etudiant findById(Long id){
        return etudiantRepository.findById(id).orElseThrow(()->
                new RuntimeException("etudiant not found"));
    }
}
