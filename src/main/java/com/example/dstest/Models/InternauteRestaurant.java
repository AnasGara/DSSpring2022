package com.example.dstest.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="Reservation")
public class InternauteRestaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String mois;

    @ManyToOne
    @JoinColumn(name = "internaute_id")
    @JsonIgnore
    Internaute internaute;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "restaurent_id")
    Restaurent restaurent;



}
