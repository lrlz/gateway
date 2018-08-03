package com.timevale.gateway.message;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ActiveMQTest {

    @Resource
    Producer producer;

    @Test
    public void product() {
        for (int i = 0; i < 10; i++) {
//            producer.send("send message no" +i, "test.queue");
            producer.send("send message2, nois" +i, "test.queue");
            producer.send("send message no is" + i, "test.queue");
        }
    }

}
