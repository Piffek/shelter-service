package com.seniority.shelter.createPlace.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class CreatePlaceRequest {
    private Long id;
    private String name;
    private String city;
    private String postcode;
}
