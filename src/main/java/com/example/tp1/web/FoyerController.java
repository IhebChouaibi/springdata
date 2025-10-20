package com.example.tp1.web;

import com.example.tp1.dto.FoyerDto;
import com.example.tp1.service.FoyerService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/foyer")
@RequiredArgsConstructor
public class FoyerController {
    private final FoyerService foyerService;

    @GetMapping("/{id}")
    public ResponseEntity<FoyerDto> getFoyerById( @PathVariable  Long id){
        return ResponseEntity.ok(foyerService.getFoyerById(id));
    }
    @GetMapping("/all")
    public ResponseEntity<Page<FoyerDto>> getAllFoyers(int page, int size){
        return ResponseEntity.ok(foyerService.getAllFoyers(page,size));
    }

    @PostMapping("/add")
    public ResponseEntity<FoyerDto> addFoyer(FoyerDto foyer){
        return ResponseEntity.ok(foyerService.addFoyer(foyer));
    }
    @PatchMapping("/update")
    public ResponseEntity<FoyerDto> updateFoyer(FoyerDto foyer){
        return ResponseEntity.ok(foyerService.updateFoyer(foyer));
    }
    @DeleteMapping("/delete}")
    public void deleteFoyer(@RequestBody Long id){
        foyerService.deleteFoyer(id);
    }
}
