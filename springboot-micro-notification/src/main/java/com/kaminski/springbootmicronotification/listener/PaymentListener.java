package com.kaminski.springbootmicronotification.listener;

import com.kaminski.springbootmicronotification.domain.Payment;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class PaymentListener {

    @KafkaListener(
            topics = "payment-topic",
            groupId = "create-group",
            containerFactory = "jsonContainerFactory")
    public void notification(@Payload Payment payment){
        log.info("Identificada uma nova compra {}.", payment.toString());
        log.info("Nofificando nova compra ...");
    }

}