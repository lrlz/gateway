package com.timevale.gateway.controller;

import com.timevale.gateway.entity.Auth_info;
import com.timevale.gateway.service.IAuth_infoService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {

    @Autowired
    IAuth_infoService auth_infoService;

    @org.junit.Test
    public void test() {
        Auth_info info = new Auth_info();
        info.setAuth_agent_id(1);
        info.setCorp_name("aaa");
        info.setCreate_time(LocalDateTime.now());
        auth_infoService.insert(info);
    }

}
