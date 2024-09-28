package com.seniority.shelter.findPlace;

import com.seniority.shelter.findPlace.entities.Place;
import org.springframework.data.repository.CrudRepository;

public interface FindPlaceRepository extends CrudRepository<Place, Long> {
}
