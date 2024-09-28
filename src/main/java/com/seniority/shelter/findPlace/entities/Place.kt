package com.seniority.shelter.findPlace.entities

import jakarta.persistence.*


@Entity(name = "FIND_PLACE")
@Table(name = "PLACE")
data class Place(
    var name: String = "",
    var city: String = "",
    var postcode: String = "",
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 1,
)
