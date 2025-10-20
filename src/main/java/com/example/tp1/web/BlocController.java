package com.example.tp1.web;

import com.example.tp1.dto.BlocDto;
import com.example.tp1.service.BlocService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bloc")
@RequiredArgsConstructor
public class BlocController {
    private final BlocService blocService;

    @GetMapping("/{id}")
    public ResponseEntity<BlocDto> getBlocById(@PathVariable Long id){
       return ResponseEntity.ok(blocService.getBlocById(id));
    }
    @PostMapping("/add")
    public ResponseEntity<BlocDto> addBloc(BlocDto bloc){
        return ResponseEntity.ok(blocService.addBloc(bloc));
    }


    @PatchMapping("/update")
    public ResponseEntity<BlocDto> updateBloc(BlocDto bloc){
        return ResponseEntity.ok(blocService.updateBloc(bloc));
    }
    @DeleteMapping("/delete}")
    public void deleteBloc(@RequestBody Long id){
        blocService.deleteBloc(id);

    }
    @GetMapping("/all")
    public ResponseEntity<Page<BlocDto>> getAllBlocs(int page, int size){
        return ResponseEntity.ok(blocService.getAllBlocs(page,size));
    }




}
