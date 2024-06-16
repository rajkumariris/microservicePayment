package dev.raj.paymentservice.RazoyPay;

import com.stripe.exception.StripeException;
import dev.raj.paymentservice.paymentGateway.PaymentGateway;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class RazorPayimple implements PaymentGateway {
    @Override
    public String createPaymentLink(Long amount) {
        return null;
    }
}
