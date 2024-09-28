package com.seniority.shelter.findPlace

import com.seniority.shelter.findPlace.dtos.PlaceDto
import com.seniority.shelter.findPlace.entities.Place
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class FindPlace(private val findPlaceRepository: FindPlaceRepository) {

    fun findAll(): List<PlaceDto> {
        val places = findPlaceRepository.findAll()
        return places.filterNotNull().map { place -> this.toDto(place) }
    }

    fun nameById(shelterId: Long): String {
        val place = findPlaceRepository.findByIdOrNull(shelterId)
            ?: throw IllegalArgumentException("cannot found shelter with if $shelterId")

        return place.name
    }

    private fun toDto(place: Place): PlaceDto {
        return PlaceDto(place.id, place.name, place.city, place.postcode)
    }
}
