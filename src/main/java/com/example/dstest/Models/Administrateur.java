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

public class Administrateur extends Internaute{
//
    String email;
    String password;

    @OneToMany(mappedBy = "administrateur", cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    List<Restaurent> restos;


}
