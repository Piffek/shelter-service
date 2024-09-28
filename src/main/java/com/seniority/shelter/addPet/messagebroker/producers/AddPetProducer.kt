package com.seniority.shelter.addPet.messagebroker.producers

import com.google.gson.Gson
import com.seniority.shelter.addPet.messagebroker.PetProperties
import com.seniority.shelter.addPet.messagebroker.command.AddPetCommand
import com.seniority.shelter.addPet.request.AddPetRequest
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.stereotype.Service

@Service
class AddPetProducer(val petProperties: PetProperties, val rabbitTemplate: RabbitTemplate) {
    fun produce(shelterId: Long, addPetRequest: AddPetRequest) {
        val command = AddPetCommand(
            addPetRequest.name,
            addPetRequest.foundCity,
            shelterId
        )
        rabbitTemplate.convertAndSend(petProperties.exchangeName, petProperties.routingKey, convertToJson(command))
    }

    private fun convertToJson(addPetCommand: AddPetCommand): String {
        val gson = Gson()
        return gson.toJson(addPetCommand)
    }
}