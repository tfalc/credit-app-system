package me.dio.creditappsystem.service.impl

import me.dio.creditappsystem.entity.Credit
import me.dio.creditappsystem.repository.CreditRepository
import me.dio.creditappsystem.service.ICreditService
import me.dio.creditappsystem.service.ICustomerService
import org.springframework.stereotype.Service
import java.util.*

@Service
class CreditService(
    private val creditRepository: CreditRepository,
    private val customerService: ICustomerService
) : ICreditService {
    override fun save(credit: Credit): Credit {
        credit.apply {
            customer = customerService.findById(credit.customer?.id!!)
        }
        return this.creditRepository.save(credit)
    }

    override fun findAllByCustomerId(customerId: Long): List<Credit> = this.creditRepository.findAllByCustomerId(customerId)

    override fun findByCreditCode(customerId: Long, creditCode: UUID): Credit {
        val credit: Credit = this.creditRepository.findByCreditCode(creditCode) ?: throw RuntimeException("Creditcode not found")
        return if(credit.customer?.id.let { it == customerId }) credit else throw RuntimeException("Creditcode not found")
    }
}