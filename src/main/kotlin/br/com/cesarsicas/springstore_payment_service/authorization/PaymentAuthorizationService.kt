package br.com.cesarsicas.springstore_payment_service.authorization

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PaymentAuthorizationService {

    @Autowired
    lateinit var paymentAuthorizationRepository: PaymentAuthorizationRepository

    fun authorizePayment(createAuthorizePaymentDto: CreateAuthorizePaymentDto) {


        //simulating call for a payment authorizer
        Thread.sleep(3000)


        paymentAuthorizationRepository.save(
            PaymentAuthorizationEntity(
                null,
                createAuthorizePaymentDto.creditCardNumber,
                createAuthorizePaymentDto.cvv,
                createAuthorizePaymentDto.brand,
                createAuthorizePaymentDto.expDate,
                createAuthorizePaymentDto.cardOwner,
                true
            )
        )
    }

}