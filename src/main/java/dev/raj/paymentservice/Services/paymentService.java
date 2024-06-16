package dev.raj.paymentservice.Services;


import com.stripe.exception.StripeException;
import dev.raj.paymentservice.Stripe.StripePaymentGateway;
import dev.raj.paymentservice.paymentGateway.PaymentGateway;
import org.springframework.stereotype.Service;

@Service
public class paymentService {
   PaymentGateway paymentGateway;
    public paymentService(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }
    public String paymentService(Long Orderid) throws StripeException {
        // Order order = orderService.getOrderDetails(orderId)
        // Long amount = order.getAmount();
        // double amount = 10.10; // store number * 100
        // String orderId, String email, String phoneNumber, Long amount
//        Long amount = 1010L; // 10.00 => 1000
        return   paymentGateway.createPaymentLink(10000L);

    }
}
