package me.dio.creditappsystem.entity

import me.dio.creditappsystem.util.Status
import java.math.BigDecimal
import java.time.LocalDate
import java.util.UUID

data class Credit (
    var creditCode: UUID = UUID.randomUUID(),
    val creditValue: BigDecimal = BigDecimal.ZERO,
    val dayFirstInstallment: LocalDate,
    var numberOfInstallments: Int = 0,
    val status: Status = Status.IN_PROGRESS,
    val customer: Customer? = null,
    val id: Long? = null
)
