package com.seniority.shelter.domain;

import com.seniority.shelter.dataaccess.FindPlaceRepository;
import com.seniority.shelter.dataaccess.entites.Place;
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
