package com.tekbees.demo.controller;

import com.tekbees.demo.model.Trip;
import com.tekbees.demo.services.TripService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/trip")
@Api(value = "API to search Student from a Student Repository by different search parameters",
        description = "This API provides the capability to search Student from a Student Repository", produces = "application/json")
public class TripController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private TripService service;


    //@GetMapping("/listar")
    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    @ApiOperation(value = "Get All Trips", produces = "application/json")
    public ResponseEntity<?> listTrips() {
        return new ResponseEntity<>(service.listTrips(), HttpStatus.OK);
    }

    @RequestMapping(value = "/listarByCity", method = RequestMethod.GET)
    @ApiOperation(value = "Get All Trips group by city", produces = "application/json")
    public ResponseEntity<?> listTripsByCity() {
        return new ResponseEntity<>(service.listByCity(), HttpStatus.OK);
    }

    @RequestMapping(value = "/listarByCountry", method = RequestMethod.GET)
    @ApiOperation(value = "Get All Trips group by country", produces = "application/json")
    public ResponseEntity<?> listTripsByCountry() {
        return new ResponseEntity<>(service.listByCountry(), HttpStatus.OK);
    }

    @PostMapping("/guardar")
    public ResponseEntity<?> guardar(@RequestBody Trip items) {
        System.out.println(items);
        return new ResponseEntity<>(service.guardar(items), HttpStatus.OK);
    }
}
