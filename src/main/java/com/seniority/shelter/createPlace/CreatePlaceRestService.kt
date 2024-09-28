package com.seniority.shelter.createPlace

import com.seniority.shelter.createPlace.request.CreatePlaceRequest
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/place/create")
class CreatePlaceRestService(private val createPlace: CreatePlace) {

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    private fun create(@RequestBody createPlaceRequest: CreatePlaceRequest) {
        createPlace.createPlace(createPlaceRequest)
    }
}
