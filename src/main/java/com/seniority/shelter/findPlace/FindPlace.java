package com.seniority.shelter.findPlace;

import com.seniority.shelter.findPlace.entities.Place;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FindPlace {

    private final FindPlaceRepository findPlaceRepository;

    public List<Place> findAll() {
        return (List<Place>) findPlaceRepository.findAll();
    }
}
