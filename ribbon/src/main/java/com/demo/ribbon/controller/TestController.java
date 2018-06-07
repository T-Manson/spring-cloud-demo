package com.demo.ribbon.controller;

import com.demo.ribbon.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    ITestService testServiceImpl;

    /**
     * 测试返回的结果
     *
     * @return
     */
    @RequestMapping(value = "/hello-world", method = RequestMethod.GET)
    public String helloWorld() {
        return testServiceImpl.helloWorld();
    }
}
