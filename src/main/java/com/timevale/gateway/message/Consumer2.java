package com.timevale.gateway.message;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer2 {

    @JmsListener(destination = "test.queue")
    public void consume(String message) {
        System.out.println("comsume2 message:"+ message);
    }

}
