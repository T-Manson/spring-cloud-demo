package com.demo.ribbon.service;

/**
 *
 */
public interface ITestService {
    /**
     * 测试rest-ribbon，调用在Eureka上已注册的api
     * 需要自己指定url调用
     *
     * @return
     */
    String helloWorld();
}
