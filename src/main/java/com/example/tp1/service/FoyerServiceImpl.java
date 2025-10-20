package com.example.tp1.service;

import com.example.tp1.dto.FoyerDto;
import com.example.tp1.dto.FullDetails;
import com.example.tp1.entities.Foyer;
import com.example.tp1.entities.Universite;
import com.example.tp1.mapper.FoyerMapper;
import com.example.tp1.mapper.UniversiteMapper;
import com.example.tp1.repositories.BlocRepository;
import com.example.tp1.repositories.FoyerRepository;
import com.example.tp1.repositories.UniversiteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FoyerServiceImpl implements FoyerService {

    private final FoyerMapper foyerMapper;
    private final FoyerRepository foyerRepository;
    private final UniversiteRepository universiteRepository;
    private final UniversiteMapper universiteMapper;

    @Override
    public FoyerDto getFoyerById(Long id) {
        Foyer foyer = findById(id);
        return foyerMapper.toDto(foyer);


    }

    @Override
    public FoyerDto updateFoyer(FoyerDto foyer) {
        Foyer  existFoyer = findById(foyer.getIdFoyer());
        Foyer foyerUpdated = foyerMapper.toEntity(foyer);
        foyerRepository.save(foyerUpdated);
        return foyer;
    }

    @Override
    public void deleteFoyer(Long id) {
        Foyer existFoyer = findById(id);
        foyerRepository.delete(existFoyer);
        universiteRepository.delete(existFoyer.getUniversite());

    }

    @Override
    public FoyerDto addFoyer(FoyerDto foyer) {
        Universite existUniver= universiteRepository.findById(foyer.getUniversiteId()).
                orElseThrow(()-> new RuntimeException("universite not found"));
        Foyer foyerSaved = foyerRepository.save(foyerMapper.toEntity(foyer));
        return foyerMapper.toDto(foyerSaved);

    }

    @Override
    public Page<FoyerDto> getAllFoyers(int page, int size) {
        Page<Foyer> foyers = foyerRepository.findAll(PageRequest.of(page, size));
        return foyers.map(foyerMapper::toDto);

    }



    private Foyer findById(Long id){
        return foyerRepository.findById(id).orElseThrow(()->
                new RuntimeException("foyer not found"));
    }

}
