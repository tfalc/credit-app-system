package me.dio.creditappsystem.service

import me.dio.creditappsystem.entity.Customer

interface ICustomerService {
    fun save(customer: Customer): Customer
    fun findById(id: Long): Customer
    fun delete(id: Long)

}