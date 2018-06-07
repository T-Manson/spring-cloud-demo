package com.demo.eurekaclient.controller;

import com.demo.eurekaclient.entity.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestContorller {
    @Value("${server.port}")
    String port;

    /**
     * 测试接口，将当前api注册到Eureka上
     *
     * @return
     */
    @RequestMapping(value = "/hello-world", method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello World! from port:" + port;
    }

    public String getTestEntity(){
        return new Test().toString();
    }
}
