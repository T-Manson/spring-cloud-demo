package com.demo.feign.interfaces;

import com.demo.feign.fallback.TestFallbackFactory;
import com.demo.feign.impl.TestServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Feign测试可插拔接口
 */
//添加Service注解防止controller中代码检测注入报错，实现断路器后不用添加
//@Service
//fallback，添加断路触发的方法，默认自带断路器不设置抛出HystrixException
//fallbackFactory，需要捕获具体的异常时提供
@FeignClient(value = "test-service", fallbackFactory = TestFallbackFactory.class)//, fallback = TestServiceImpl.class)
public interface ITestService {
    @RequestMapping(value = "/hello-world", method = RequestMethod.GET)
    String helloWorld();
}
