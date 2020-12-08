package com.udemy.rabbitmq.entities;



import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="ETUDIANT")
public class Etudiant implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String nom;
    private String prenom;

  public Long getIdEtudiant() {
    return idEtudiant;
  }

  public void setIdEtudiant(Long idEtudiant) {
    this.idEtudiant = idEtudiant;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  private int age;
}
