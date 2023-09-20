package com.tekbees.demo.repository;

import com.tekbees.demo.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TripRepository extends JpaRepository<Trip, Long> {

    @Query("SELECT p.city.name, COUNT(p.city) FROM Trip p GROUP BY p.city.name")
    List<Object[]> groupByCity();

    @Query("SELECT p.country.name, COUNT(p.country) FROM Trip p GROUP BY p.country.name")
    List<Object[]> groupByCountry();

}
