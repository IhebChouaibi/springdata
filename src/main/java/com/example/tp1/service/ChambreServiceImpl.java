package com.example.tp1.service;

import com.example.tp1.dto.ChamberDto;
import com.example.tp1.entities.Chambre;
import com.example.tp1.mapper.ChambreMapper;
import com.example.tp1.repositories.BlocRepository;
import com.example.tp1.repositories.ChambreRepsoitory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChambreServiceImpl implements ChamberService{
    private final ChambreRepsoitory chambreRepsoitory;
    private final ChambreMapper chambreMapper;
    private final BlocRepository blocRepository;

    @Override
    public ChamberDto getChamberById(Long id) {
        Chambre cham = findById(id);
        return chambreMapper.toDto(cham);
    }

    @Override
    public ChamberDto updateChamber(ChamberDto chamber) {
        Chambre cham = findById(chamber.getIdChambre());
        Chambre chamUpdated = chambreMapper.toEntity(chamber);
        chambreRepsoitory.save(chamUpdated);
        return  chamber;
    }

    @Override
    public void deleteChamber(Long id) {

    }

    @Override
    public ChamberDto addChamber(ChamberDto chamber) {
        return null;
    }

    @Override
    public Page<ChamberDto> getAllChambres(int page, int size) {
      Page<Chambre> chambres = chambreRepsoitory.findAll(PageRequest.of(page, size));
      return chambres.map(chambreMapper::toDto);

    }

    public Chambre findById(Long id){
        Chambre cham = chambreRepsoitory.findById(id).orElseThrow(()-> new RuntimeException("chambre does not exist"));
        return cham;
    }

}
