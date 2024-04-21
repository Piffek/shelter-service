package com.seniority.shelter.rest;

import com.seniority.shelter.dataaccess.entites.Place;
import com.seniority.shelter.domain.FindPlace;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/place")
@RequiredArgsConstructor
public class FindPlaceRestService {

    private final FindPlace findPlace;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    private List<Place> findAll() {
        return findPlace.findAll();
    }
}
