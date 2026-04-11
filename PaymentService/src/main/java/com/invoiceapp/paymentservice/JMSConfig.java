package com.invoiceapp.paymentservice;

import jakarta.jms.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;

@Configuration
@EnableJms
public class JMSConfig {

    @Bean
    public DefaultJmsListenerContainerFactory jmsListenerContainerFactory(ConnectionFactory connectionFactory){
        DefaultJmsListenerContainerFactory jmslistenerContainerFactory = new DefaultJmsListenerContainerFactory();
        jmslistenerContainerFactory.setConnectionFactory(connectionFactory);
        jmslistenerContainerFactory.setConcurrency("5-10");

        return jmslistenerContainerFactory;
    }
}
