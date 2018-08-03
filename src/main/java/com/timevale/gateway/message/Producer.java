package com.timevale.gateway.message;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.Queue;

@Service
public class Producer {

    @Resource
    private JmsMessagingTemplate jmsMessagingTemplate;

//    @JmsListener(destination = "test.queue" )
    public void send(String message, String destination) {
        Queue queue = new ActiveMQQueue(destination);
        System.out.println("===send message===");
//        Destination queue = new ActiveMQQueue(destination);
//        jmsMessagingTemplate.convertAndSend(message);
        jmsMessagingTemplate.convertAndSend(queue, message);
    }


}
