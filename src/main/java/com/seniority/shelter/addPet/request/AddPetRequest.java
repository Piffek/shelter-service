package com.seniority.shelter.addPet.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class AddPetRequest {
    private final String name;
    private final String foundCity;
}
