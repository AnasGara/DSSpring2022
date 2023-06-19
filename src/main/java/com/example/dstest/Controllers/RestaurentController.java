package com.example.dstest.Controllers;

import com.example.dstest.Models.Restaurent;
import com.example.dstest.Repositories.RestaurentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/restaurent")

public class RestaurentController {
    @Autowired
    RestaurentRepository restaurentRepository;
//    public RestaurentController(RestaurentRepository restaurentRepository) {
//        this.restaurentRepository = restaurentRepository;
//    }
    @PostMapping("/add")
    public Restaurent addRestaurent(@RequestBody Restaurent restaurent){
        return restaurentRepository.save(restaurent);
    }
    @GetMapping("/get/{id}")
    public Restaurent getRestaurent(@PathVariable Long id){
        return restaurentRepository.findById(id).get();
    }
    @PutMapping("/update/{id}")
    public Restaurent updateRestaurent(@RequestBody Restaurent restaurent, @PathVariable Long id){
        restaurent.setId(id);
        return restaurentRepository.save(restaurent);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteRestaurent(@PathVariable Long id){
        restaurentRepository.deleteById(id);
    }

}
