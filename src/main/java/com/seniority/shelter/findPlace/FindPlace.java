package com.seniority.shelter.findPlace;

import com.seniority.shelter.findPlace.dtos.PlaceDto;
import com.seniority.shelter.findPlace.entities.Place;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FindPlace {

    private final FindPlaceRepository findPlaceRepository;

    public List<PlaceDto> findAll() {
        var places = (List<Place>) findPlaceRepository.findAll();

        return places
                .stream()
                .map(this::toDto)
                .toList();
    }

    private PlaceDto toDto(Place place) {
        return new PlaceDto(place.getId(), place.getName(), place.getCity(), place.getPostcode());
    }
}
