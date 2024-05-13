package com.seniority.shelter.createPlace;

import com.seniority.shelter.createPlace.request.CreatePlaceRequest;
import com.seniority.shelter.findPlace.dtos.PlaceDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/place/create")
@RequiredArgsConstructor
public class CreatePlaceRestService {
    private final CreatePlace createPlace;

    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    private void create(@RequestBody CreatePlaceRequest createPlaceRequest) {
        createPlace.createPlace(createPlaceRequest);
    }
}
