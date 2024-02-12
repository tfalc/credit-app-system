package me.dio.creditappsystem.entity

import jakarta.persistence.*

@Entity
@Table(name = "customer")
data class Customer(
    @Column(name = "first_name", nullable = false)
    var firstName: String = "",
    @Column(name = "last_name", nullable = false)
    var lastName: String = "",
    @Column(name = "cpf", nullable = false, unique = true)
    val cpf: String = "",
    @Column(name = "email", nullable = false, unique = true)
    var email: String = "",
    @Column(name = "password", nullable = false)
    var password: String = "",
    @Column(name = "address", nullable = false)
    @Embedded
    var address: Address = Address(),
    @Column(name = "credits", nullable = false)
    @OneToMany(mappedBy = "customer", cascade = [CascadeType.REMOVE, CascadeType.PERSIST], fetch = FetchType.LAZY)
    var credits: List<Credit> = mutableListOf(),

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
)
