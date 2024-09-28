package com.seniority.shelter.findPlace;

import com.seniority.shelter.findPlace.dtos.PlaceDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/place/find")
@RequiredArgsConstructor
public class FindPlaceRestService {

    private final FindPlace findPlace;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    private List<PlaceDto> findAll() {
        return findPlace.findAll();
    }

    @GetMapping("/name/{shelterId}")
    @ResponseStatus(HttpStatus.OK)
    private String findNameById(@PathVariable("shelterId") Long shelterId) {
        return findPlace.nameById(shelterId);
    }
}
