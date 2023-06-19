package com.example.dstest.Controllers;

import com.example.dstest.Models.Internaute;
import com.example.dstest.Models.InternauteRestaurant;
import com.example.dstest.Models.Restaurent;
import com.example.dstest.Repositories.InternauteRepository;
import com.example.dstest.Repositories.InternauteRestaurantRepository;
import com.example.dstest.Repositories.RestaurentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
    @Autowired
    InternauteRestaurantRepository internauteRestaurantRepository;
    @Autowired
    InternauteRepository internauteRepository;
    @Autowired
    RestaurentRepository restaurentRepository;

    @PostMapping("/add/{idi}/{idr}")
    public void addReservation(@RequestBody InternauteRestaurant internauteRestaurant, @PathVariable Long idi, @PathVariable Long idr){
        internauteRestaurant.setInternaute(internauteRepository.findById(idi).get());
        internauteRestaurant.setRestaurent(restaurentRepository.findById(idr).get());
//        internauteRestaurant.setMois("juin");
    }

    @GetMapping("/get/{mois}")
    public int getReservation(@PathVariable String mois){
        return internauteRestaurantRepository.countInternauteRestaurantByMois(mois);
    }

    @GetMapping("/getMostVisitedRestaurant")
    public Restaurent getMostVisitedRestaurant(){
        return internauteRestaurantRepository.findMostVisitedRestaurant();
    }

}
