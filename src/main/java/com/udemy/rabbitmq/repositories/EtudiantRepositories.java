package com.udemy.rabbitmq.repositories;

import com.udemy.rabbitmq.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepositories extends JpaRepository<Etudiant , Long> {
}
