package com.kaminski.springbootmicropayment.service;

import com.kaminski.springbootmicropayment.config.ApplicationProperties;
import com.kaminski.springbootmicropayment.model.Payment;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Log4j2
@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final KafkaTemplate<String, Serializable> kafkaTemplate;
    private final ApplicationProperties properties;

    @Override
    public void payment(Payment payment) {
        log.info("Enviando pagamento ...");
        kafkaTemplate.send(properties.getTopicName(), payment);
    }

}