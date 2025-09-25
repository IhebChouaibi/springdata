package com.example.tp1.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Foyer {
    @Id
    private Long idFoyer;
    @Column(nullable = false, name="nom")
    private String nomFoyer;
    @Column (nullable = false , name ="capacite")
    private String capaciteFoyer;

}
