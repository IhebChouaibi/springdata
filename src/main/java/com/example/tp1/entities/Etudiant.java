package com.example.tp1.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Etudiant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEdutiant;

    @Column(nullable = false,name ="nom")
    private String nomEt;
    @Column(nullable = false ,name = "prenom")
    private String prenomEt;
    @Column(unique = true)
    private Long cin;
    @Column(nullable = false , length = 100)
    private String ecole;
    @DateTimeFormat(style = "dd/mm/yyyy")
    private LocalDate dateNaissance;
}
