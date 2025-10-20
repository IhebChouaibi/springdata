package com.example.tp1.web;

import com.example.tp1.dto.ChamberDto;
import com.example.tp1.service.ChamberService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chambre")
@RequiredArgsConstructor
public class ChambreController {
    private final ChamberService chamberService;

    @GetMapping("/{id}")

    public ResponseEntity<ChamberDto> getChamberById(@PathVariable Long id){
        return ResponseEntity.ok(chamberService.getChamberById(id));

    }

    @GetMapping("/all")
    public ResponseEntity<Page<ChamberDto>> getAllChambres(int page, int size){
        return ResponseEntity.ok(chamberService.getAllChambres(page,size));
    }
    @PostMapping("/add")
    public ResponseEntity<ChamberDto> addChamber(ChamberDto chamber){
        return ResponseEntity.ok(chamberService.addChamber(chamber));
    }
    @PatchMapping("/update")
    public ResponseEntity<ChamberDto> updateChamber(ChamberDto chamber){
        return ResponseEntity.ok(chamberService.updateChamber(chamber));
    }
    @DeleteMapping("/delete}")
    public void deleteChamber(@RequestBody Long id){
        chamberService.deleteChamber(id);
    }
}
