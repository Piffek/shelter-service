package com.seniority.shelter.createPlace.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "CREATE_PLACE")
@Table(name = "PLACE")
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String city;
    private String postcode;

    // for JPA only, no use
    public Place() {
    }

    public Place(String name, String city, String postcode) {
        this.name = name;
        this.city = city;
        this.postcode = postcode;
    }
}
