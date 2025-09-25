package com.example.tp1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    private String name;

    private String email;
    private String password;
    private String role;
}
