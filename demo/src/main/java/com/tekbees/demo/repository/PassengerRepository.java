package com.tekbees.demo.repository;

import com.tekbees.demo.model.Car;
import com.tekbees.demo.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}
