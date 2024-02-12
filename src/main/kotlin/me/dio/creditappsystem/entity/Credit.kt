package me.dio.creditappsystem.entity

import jakarta.persistence.*
import me.dio.creditappsystem.util.Status
import java.math.BigDecimal
import java.time.LocalDate
import java.util.UUID

@Entity
@Table(name = "credit")
data class Credit (
    @Column(name = "credit_code", nullable = false, unique = true)
    var creditCode: UUID = UUID.randomUUID(),

    @Column(name = "credit_value", nullable = false)
    val creditValue: BigDecimal = BigDecimal.ZERO,

    @Column(name = "day_first_installment", nullable = false)
    val dayFirstInstallment: LocalDate,

    @Column(name = "number_of_installments", nullable = false)
    var numberOfInstallments: Int = 0,

    @Column(name = "interest_rate")
    val interestRate: BigDecimal = BigDecimal.ZERO,

    @Enumerated(EnumType.STRING)
    val status: Status = Status.IN_PROGRESS,

    @ManyToOne
    var customer: Customer? = null,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
)
