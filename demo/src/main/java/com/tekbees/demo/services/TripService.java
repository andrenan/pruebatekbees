package com.tekbees.demo.services;

import com.tekbees.demo.model.Trip;
import com.tekbees.demo.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class TripService {


    @Autowired
    private TripRepository repo;

    public List<Trip> listTrips() {
        List<Trip> rw = null;
        rw = new ArrayList<>();
        try {
            rw = repo.findAll();

        } catch (Exception e) {
            rw = new ArrayList<>();
        }
        return rw;
    }

    public List<Object[]> listByCity() {
        List<Object[]> rw = null;
        rw = new ArrayList<>();
        try {
            rw = repo.groupByCity();

        } catch (Exception e) {
            rw = new ArrayList<>();
        }
        return rw;
    }

    public List<Object[]> listByCountry() {
        List<Object[]> rw = null;
        rw = new ArrayList<>();
        try {
            rw = repo.groupByCountry();

        } catch (Exception e) {
            rw = new ArrayList<>();
        }
        return rw;
    }

    public ResponseEntity<?> guardar(Trip items) {
        try {


        } catch (Exception e) {

        }
        return new ResponseEntity(HttpStatus.OK);
    }
}
