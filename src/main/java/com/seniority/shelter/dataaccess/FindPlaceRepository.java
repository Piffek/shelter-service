package com.seniority.shelter.dataaccess;

import com.seniority.shelter.dataaccess.entites.Place;
import org.springframework.data.repository.CrudRepository;

public interface FindPlaceRepository extends CrudRepository<Place, Long> {
}
