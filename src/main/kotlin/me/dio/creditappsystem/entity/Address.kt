package me.dio.creditappsystem.entity

import jakarta.persistence.Column
import jakarta.persistence.Embeddable

@Embeddable
data class Address (
    @Column(name = "zip_code", nullable = false)
    var zipCode: String = "",
    @Column(name = "street", nullable = false)
    var street: String = ""
)
