package com.example.tp1.service;

import com.example.tp1.dto.BlocDto;
import com.example.tp1.entities.Bloc;
import com.example.tp1.mapper.BlocMapper;
import com.example.tp1.repositories.BlocRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BlocServiceImpl implements BlocService {
    private final BlocRepository blocRepository;
    private final BlocMapper blocMapper;


    @Override
    public BlocDto getBlocById(Long id) {
        Bloc bloc = findById(id);
        return blocMapper.toDto(bloc);
    }

    @Override
    public BlocDto updateBloc(BlocDto bloc) {
        Bloc existBloc = findById(bloc.getId());
        Bloc BlocUpdated = blocMapper.toEntity(bloc);
        blocRepository.save(BlocUpdated);

        return bloc;
    }

    @Override
    public void deleteBloc(Long id) {
        Bloc existBloc = findById(id);
        blocRepository.delete(existBloc);

    }

    @Override
    public BlocDto addBloc(BlocDto bloc) {
        Bloc blocSaved = blocRepository.save(blocMapper.toEntity(bloc));
        return blocMapper.toDto(blocSaved);
    }

    @Override
    public Page<BlocDto> getAllBlocs(int page, int size) {
        Page<Bloc> blocs = blocRepository.findAll(PageRequest.of(page, size));
        return blocs.map(blocMapper::toDto);
    }

    private Bloc  findById(Long id){
        return blocRepository.findById(id).orElseThrow(()->
                new RuntimeException("bloc not found"));
    }
}
