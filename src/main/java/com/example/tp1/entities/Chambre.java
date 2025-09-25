package com.example.tp1.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Chambre {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idChambre;
    @Column(nullable=false)
    private Long numeroChambre;
    @Column(nullable=false)
    private TypeChambre tipoChambre;
}
