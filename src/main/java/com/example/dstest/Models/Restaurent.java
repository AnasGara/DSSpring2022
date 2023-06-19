package com.example.dstest.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Restaurent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nom;
    String specialite;
    String adresse;
    String horraire;
    Long tel;

    @ManyToOne
    @JoinColumn(name = "administrateur_id")
    Administrateur administrateur;

    @OneToMany(mappedBy = "restaurent", cascade = CascadeType.ALL)
    private List<InternauteRestaurant> internauteRestaurants;


}
