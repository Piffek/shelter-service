package com.seniority.shelter.createPlace

import com.seniority.shelter.createPlace.entities.Place
import org.springframework.data.repository.CrudRepository

interface CreatePlaceRepository : CrudRepository<Place, Long>
