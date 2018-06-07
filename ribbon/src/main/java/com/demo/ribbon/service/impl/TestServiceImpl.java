package com.demo.ribbon.service.impl;

import com.demo.ribbon.service.ITestService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestServiceImpl implements ITestService {
    @Autowired
    RestTemplate restTemplate;

    @Value("${server.port}")
    String port;

    /**
     * 测试rest-ribbon，调用在Eureka上已注册的api
     * 需要自己指定url调用
     *
     * @return
     */
    //添加断路触发的方法
    @Override
    @HystrixCommand(fallbackMethod = "error")
    public String helloWorld() {
        return restTemplate.getForObject("http://test-service/hello-world", String.class);
    }

    /**
     * 断路器触发
     *
     * @return
     */
    public String error() {
        return "error on port:" + port;
    }
}
