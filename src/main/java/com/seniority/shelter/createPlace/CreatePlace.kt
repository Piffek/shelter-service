package com.seniority.shelter.createPlace

import com.seniority.shelter.createPlace.entities.Place
import com.seniority.shelter.createPlace.request.CreatePlaceRequest
import org.springframework.stereotype.Service

@Service
class CreatePlace(private val createPlaceRepository: CreatePlaceRepository) {

    fun createPlace(createPlaceRequest: CreatePlaceRequest) {
        val place = Place(createPlaceRequest.name, createPlaceRequest.city, createPlaceRequest.postcode)
        createPlaceRepository.save(place)
    }
}
