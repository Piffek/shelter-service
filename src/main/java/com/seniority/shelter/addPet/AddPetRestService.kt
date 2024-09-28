package com.seniority.shelter.addPet

import com.seniority.shelter.addPet.messagebroker.producers.AddPetProducer
import com.seniority.shelter.addPet.request.AddPetRequest
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/place/add-pet")
class AddPetRestService(private val addPetProducer: AddPetProducer) {

    @PostMapping("/{shelterId}")
    @ResponseStatus(HttpStatus.OK)
   fun addPetToShelter(
        @PathVariable(value = "shelterId", required = true) shelterId: Long,
        @RequestBody addPetRequest: AddPetRequest
    ): String {
        addPetProducer.produce(shelterId, addPetRequest)
        return "creating..."
    }
}
