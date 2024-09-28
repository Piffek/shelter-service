package com.seniority.shelter.findPlace.entities

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table


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
