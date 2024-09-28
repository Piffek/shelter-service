package com.seniority.shelter.findPlace

import com.seniority.shelter.findPlace.dto.PlaceDto
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/place/find")
class FindPlaceRestService(private val findPlace: FindPlace) {

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    private fun findAll(): List<PlaceDto> {
        return findPlace.findAll()
    }

    @GetMapping("/name/{shelterId}")
    @ResponseStatus(HttpStatus.OK)
    private fun findNameById(@PathVariable("shelterId") shelterId: Long): String {
        return findPlace.nameById(shelterId)
    }
}
