package com.timevale.gateway.message;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @JmsListener(destination = "test.queue")
    public void consume(String message) {
        System.out.println("comsume message:"+ message);
    }

}
