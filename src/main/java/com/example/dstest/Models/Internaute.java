package com.example.dstest.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity



public class Internaute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nom;
    String prenom;

//    @ManyToMany
//    @JoinTable(name = "internaute_restaurent",
//            joinColumns = @JoinColumn(name = "internaute_id"),
//            inverseJoinColumns = @JoinColumn(name = "restaurent_id"))
//    List<Restaurent> restaurent;

    @OneToMany(mappedBy = "internaute", cascade = CascadeType.ALL)
    private List<InternauteRestaurant> internauteRestaurants;




}
