package com.tekbees.demo.model;

import javax.persistence.Table;

import javax.persistence.*;
import java.awt.*;

@Entity
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer tripIdInteger;
    private String type;

    @Column(columnDefinition = "POINT")
    private Point coordinates;

    @ManyToOne
    @JoinColumn(name = "trip")
    private Trip trip;

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public void setTripId(Integer tripIdInteger) {
        this.tripIdInteger = tripIdInteger;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

    public Integer getTripIdInteger() {
        return tripIdInteger;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }
}
