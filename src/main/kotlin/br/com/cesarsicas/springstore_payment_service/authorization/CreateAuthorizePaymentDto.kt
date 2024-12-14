package br.com.cesarsicas.springstore_payment_service.authorization

import jakarta.validation.constraints.NotEmpty

data class CreateAuthorizePaymentDto(
    @NotEmpty val creditCardNumber: String,
    @NotEmpty val cvv: String,
    @NotEmpty val brand: String,
    @NotEmpty val expDate: String,
    @NotEmpty val cardOwner: String
)
