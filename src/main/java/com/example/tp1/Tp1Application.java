package com.example.tp1;

import com.example.tp1.entities.Etudiant;
import com.example.tp1.repositories.EtudiantRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Tp1Application {

    public static void main(String[] args) {
        SpringApplication.run(Tp1Application.class, args);
    }

    CommandLineRunner init(EtudiantRepository etudiant) {
        return args -> {
            etudiant.save(Etudiant.builder().cin(11111L).nomEt("ahahahhah").ecole("sss").prenomEt("ehehheheheh").build());

        };
    }
}
