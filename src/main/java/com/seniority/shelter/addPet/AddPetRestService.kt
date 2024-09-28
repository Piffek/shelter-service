package com.seniority.shelter.addPet

import com.seniority.shelter.addPet.messagebroker.producers.AddPetProducer
import com.seniority.shelter.addPet.request.AddPetRequest
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/place/add-pet")
class AddPetRestService(private val addPetProducer: AddPetProducer) {

    @PostMapping("/{shelterId}")
    @ResponseStatus(HttpStatus.OK)
   fun addPetToShelter(
        @PathVariable("shelterId") shelterId: Long,
        @RequestBody addPetRequest: AddPetRequest
    ): String {
        addPetProducer.produce(shelterId, addPetRequest)
        return "creating..."
    }
}
