package com.invoiceapp.paymentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping("/sendOrder")
    public ResponseEntity<String> sendOrder(@RequestBody PaymentOrder paymentOrder){
        try{
            jmsTemplate.convertAndSend("InvoiceApp", paymentOrder);
            return new ResponseEntity<String>("sent", HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
