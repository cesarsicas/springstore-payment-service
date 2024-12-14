package br.com.cesarsicas.springstore_payment_service.authorization

import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/authorization")
class PaymentAuthorizationController {

    @Autowired
    lateinit var paymentAuthorizationService: PaymentAuthorizationService

    @PostMapping
    fun authorizePayment(@Valid @RequestBody createAuthorizePaymentDto: CreateAuthorizePaymentDto): ResponseEntity<Any> {
        paymentAuthorizationService.authorizePayment(createAuthorizePaymentDto)

        return ResponseEntity.ok().build();
    }
}