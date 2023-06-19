package com.example.dstest.Repositories;

import com.example.dstest.Models.Internaute;
import com.example.dstest.Models.InternauteRestaurant;
import com.example.dstest.Models.Restaurent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface InternauteRestaurantRepository extends JpaRepository<InternauteRestaurant, Long> {

    public int  countInternauteRestaurantByMois(String mois);
    public int  countInternauteRestaurantByMoisAndRestaurent(String mois, Restaurent restaurent);
    public int countInternauteRestaurantByRestaurentId(Long id);

    @Query("SELECT r.restaurent, COUNT(r) AS visitorCount " +
            "FROM InternauteRestaurant r " +
            "GROUP BY r.restaurent " +
            "ORDER BY visitorCount DESC " +
            "LIMIT 1")
    Restaurent findMostVisitedRestaurant();



}