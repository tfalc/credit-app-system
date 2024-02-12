package me.dio.creditappsystem.service.impl

import me.dio.creditappsystem.entity.Customer
import me.dio.creditappsystem.repository.CustomerRepository
import me.dio.creditappsystem.service.ICustomerService
import org.springframework.stereotype.Service

@Service
class CustomerService(
    private val customerRepository: CustomerRepository
) : ICustomerService {
    override fun save(customer: Customer): Customer {
        return this.customerRepository.save(customer);
    }

    override fun findById(id: Long): Customer = this.customerRepository.findById(id).orElseThrow() {
            throw RuntimeException("ID $id not found")
        }

    override fun delete(id: Long) = this.customerRepository.deleteById(id);
}