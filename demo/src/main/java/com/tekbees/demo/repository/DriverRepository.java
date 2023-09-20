package com.tekbees.demo.repository;

import com.tekbees.demo.model.Car;
import com.tekbees.demo.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Long> {
}
