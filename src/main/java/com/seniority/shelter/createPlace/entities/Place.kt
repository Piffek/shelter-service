package com.seniority.shelter.createPlace.entities

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity(name = "CREATE_PLACE")
@Table(name = "PLACE")
data class Place(
    val name: String? = "",
    val city: String? = "",
    val postcode: String? = ""
) {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Long = 1
}
