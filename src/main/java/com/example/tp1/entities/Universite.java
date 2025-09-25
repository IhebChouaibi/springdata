package com.example.tp1.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Universite
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;
    @Column(nullable = false, length = 100)
    private String nomUniversite;
    @Column(nullable = false, length = 100)
    private String adresse;

}
