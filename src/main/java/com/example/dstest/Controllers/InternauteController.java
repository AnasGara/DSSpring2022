package com.example.dstest.Controllers;

import com.example.dstest.Models.Internaute;
import com.example.dstest.Repositories.InternauteRepository;
import com.example.dstest.Repositories.InternauteRestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Internaute")
public class InternauteController {
    @Autowired
    InternauteRepository internauteRepository;

    @PostMapping("/add")
    public Internaute addInternaute(@RequestBody Internaute internaute){
        return internauteRepository.save(internaute);
    }


}
