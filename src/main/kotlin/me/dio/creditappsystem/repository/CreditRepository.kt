package me.dio.creditappsystem.repository

import me.dio.creditappsystem.entity.Credit
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.util.*

interface CreditRepository: JpaRepository<Credit, Long> {
    fun findByCreditCode(creditCode: UUID): Credit

    @Query("SELECT c FROM Credit c WHERE c.customer.id = :customerId")
    fun findAllByCustomerId(customerId: Long): List<Credit>
}