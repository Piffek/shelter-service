package com.seniority.shelter.createPlace;

import com.seniority.shelter.createPlace.entities.Place;
import com.seniority.shelter.createPlace.request.CreatePlaceRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreatePlace {
    private final CreatePlaceRepository createPlaceRepository;

    public void createPlace(CreatePlaceRequest createPlaceRequest) {
        var place = new Place(createPlaceRequest.getName(), createPlaceRequest.getCity(), createPlaceRequest.getPostcode());
        createPlaceRepository.save(place);
    }
}
