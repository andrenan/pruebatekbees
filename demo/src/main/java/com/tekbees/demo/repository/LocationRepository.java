package com.tekbees.demo.repository;

import com.tekbees.demo.model.Car;
import com.tekbees.demo.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
