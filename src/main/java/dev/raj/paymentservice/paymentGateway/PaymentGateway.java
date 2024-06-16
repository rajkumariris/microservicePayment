package dev.raj.paymentservice.paymentGateway;

import com.stripe.exception.StripeException;

public interface PaymentGateway {


    public String createPaymentLink(Long amount) throws StripeException;
}
