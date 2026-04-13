package com.invoiceapp.paymentservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class PaymentConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(PaymentConsumer.class);

    @JmsListener(destination = "InvoiceApp")
    public void messageListener(PaymentOrder paymentOrder){
        LOGGER.info("Message recieved. {}", paymentOrder);

    }
}
