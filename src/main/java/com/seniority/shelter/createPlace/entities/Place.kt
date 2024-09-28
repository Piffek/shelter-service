package com.seniority.shelter.createPlace.entities

import jakarta.persistence.*

@Entity(name = "CREATE_PLACE")
@Table(name = "PLACE")
data class Place(
    val name: String? = "",
    val city: String? = "",
    val postcode: String? = ""
) {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Long = 0
}
