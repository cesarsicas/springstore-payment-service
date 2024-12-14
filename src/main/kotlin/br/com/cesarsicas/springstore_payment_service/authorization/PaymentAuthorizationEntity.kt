package br.com.cesarsicas.springstore_payment_service.authorization

import jakarta.persistence.*
import jakarta.validation.constraints.NotEmpty

@Table(name = "payment_authorizations")
@Entity(name = "PaymentAuthorization")
data class PaymentAuthorizationEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null,
    private val creditCardNumber: String,
    private val cvv: String,
    private val brand: String,
    private val expDate: String,
    private val cardOwner: String,
    private val isSuccess:Boolean
)
