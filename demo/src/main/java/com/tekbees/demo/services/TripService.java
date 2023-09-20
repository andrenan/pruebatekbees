package com.tekbees.demo.services;

import com.tekbees.demo.model.Car;
import com.tekbees.demo.model.City;
import com.tekbees.demo.model.Country;
import com.tekbees.demo.model.Trip;
import com.tekbees.demo.repository.*;
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

    @Autowired
    private CarRepository carrepo;

    @Autowired
    private CityRepository cityrepo;

    @Autowired
    private CountryRepository countryrepo;

    @Autowired
    private DriverRepository driverrepo;

    @Autowired
    private LocationRepository locationrepo;

    @Autowired
    private PassengerRepository passengerrepo;

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
            items.setCar(carrepo.save(items.getCar()));
            items.setCity(cityrepo.save(items.getCity()));
            items.setCountry(countryrepo.save(items.getCountry()));
            items.setDriver(driverrepo.save(items.getDriver()));
            repo.save(items);
        } catch (Exception e) {

        }
        return new ResponseEntity(HttpStatus.OK);
    }
}
