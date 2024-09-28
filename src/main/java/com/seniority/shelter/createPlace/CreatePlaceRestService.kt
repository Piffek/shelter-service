package com.seniority.shelter.createPlace

import com.seniority.shelter.createPlace.request.CreatePlaceRequest
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/place/create")
class CreatePlaceRestService(private val createPlace: CreatePlace) {

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    private fun create(@RequestBody createPlaceRequest: CreatePlaceRequest) {
        createPlace.createPlace(createPlaceRequest)
    }
}
