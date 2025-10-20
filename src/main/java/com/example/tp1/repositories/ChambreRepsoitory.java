package com.example.tp1.repositories;

import com.example.tp1.entities.Chambre;
import com.example.tp1.entities.Foyer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ChambreRepsoitory extends JpaRepository<Chambre,Long> {
    Page<Chambre> findAll(Pageable pageable);
}
