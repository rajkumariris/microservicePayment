package dev.raj.paymentservice.Controllers;

import com.stripe.exception.StripeException;
import dev.raj.paymentservice.Dtos.CreatePaymentLinkRequestDto;
import dev.raj.paymentservice.Services.paymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {


    paymentService paymentService;

    public PaymentController(paymentService paymentService){
        this.paymentService = paymentService;
    }
    @PostMapping("/")
    public String CreatePaymentLink(@RequestBody CreatePaymentLinkRequestDto request) throws StripeException {
       return paymentService.paymentService(request.getId());

    }
}
