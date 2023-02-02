package com.kaminski.springbootmicropayment.controller;

import com.kaminski.springbootmicropayment.model.Payment;
import com.kaminski.springbootmicropayment.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequiredArgsConstructor
@RequestMapping("v1/payment")
public class PaymentControllerImpl implements PaymentController {

    private final PaymentService paymentService;

    @Override
    public ResponseEntity<Payment> payment(Payment payment) {
        log.info("Recebendo o pagamento {}", payment.toString());
        paymentService.payment(payment);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}