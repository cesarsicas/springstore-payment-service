package br.com.cesarsicas.springstore_payment_service.authorization

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PaymentAuthorizationRepository : JpaRepository<PaymentAuthorizationEntity, Long>
