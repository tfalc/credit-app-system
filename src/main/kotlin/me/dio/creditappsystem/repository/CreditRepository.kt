package me.dio.creditappsystem.repository

import me.dio.creditappsystem.entity.Credit
import org.springframework.data.jpa.repository.JpaRepository

interface CreditRepository: JpaRepository<Credit, Long> {
}