package com.seniority.shelter.findPlace

import com.seniority.shelter.findPlace.entities.Place
import org.springframework.data.repository.CrudRepository

interface FindPlaceRepository : CrudRepository<Place, Long>
