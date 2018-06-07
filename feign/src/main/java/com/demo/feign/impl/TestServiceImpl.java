package com.demo.feign.impl;

import com.demo.feign.interfaces.ITestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements ITestService {
    @Value("${server.port}")
    String port;
    
    /**
     * 实现断路方法
     *
     * @return
     */
    @Override
    public String helloWorld() {
        return "error on port:" + port;
    }
}
