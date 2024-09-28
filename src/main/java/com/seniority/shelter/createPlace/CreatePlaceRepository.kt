package com.seniority.shelter.createPlace;

import com.seniority.shelter.createPlace.entities.Place;
import org.springframework.data.repository.CrudRepository;

public interface CreatePlaceRepository extends CrudRepository<Place, Long> {
}
