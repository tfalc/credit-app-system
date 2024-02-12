package me.dio.creditappsystem.service

import me.dio.creditappsystem.entity.Credit
import java.util.*

interface ICreditService {

    fun save(credit: Credit): Credit
    fun findAllByCustomerId(customerId: Long): List<Credit>
    fun findByCreditCode(customerId: Long, creditCode: UUID): Credit
}