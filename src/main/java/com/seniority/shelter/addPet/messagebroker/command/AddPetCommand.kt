package com.seniority.shelter.addPet.messagebroker.command

data class AddPetCommand(val name: String, val foundCity: String, val shelterId: Long)