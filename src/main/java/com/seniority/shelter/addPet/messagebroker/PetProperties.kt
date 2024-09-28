package com.seniority.shelter.addPet.messagebroker

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "pet")
data class PetProperties(val exchangeName: String, val routingKey: String, val queueName: String)