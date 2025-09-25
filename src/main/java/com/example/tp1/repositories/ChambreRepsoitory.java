package com.example.tp1.repositories;

import com.example.tp1.entities.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChambreRepsoitory extends JpaRepository<Foyer,Long> {
}
