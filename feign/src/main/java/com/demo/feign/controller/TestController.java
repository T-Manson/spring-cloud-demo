package com.demo.feign.controller;

import com.demo.feign.interfaces.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    ITestService testService;

    /**
     * 测试返回的结果
     *
     * @return
     */
    @RequestMapping(value = "/hello-world", method = RequestMethod.GET)
    public String helloWorld() {
        return testService.helloWorld();
    }
}
