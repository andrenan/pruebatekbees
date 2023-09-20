package com.tekbees.demo.repository;

import com.tekbees.demo.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
    Car findByPlate(String plate);
}
