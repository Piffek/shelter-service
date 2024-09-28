package com.seniority.shelter

import com.seniority.shelter.addPet.messagebroker.PetProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties(PetProperties::class)
class ShelterApplication

fun main(args: Array<String>) {
    runApplication<ShelterApplication>(*args)
}


