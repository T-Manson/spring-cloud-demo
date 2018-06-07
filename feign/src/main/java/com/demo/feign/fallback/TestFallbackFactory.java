package com.demo.feign.fallback;

import com.demo.feign.impl.TestServiceImpl;
import com.demo.feign.interfaces.ITestService;
import feign.hystrix.FallbackFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestFallbackFactory implements FallbackFactory<ITestService> {
    @Value("${server.port}")
    String port;

    @Override
    public ITestService create(Throwable throwable) {
        if (throwable != null)
            throwable.printStackTrace();
        return new TestServiceImpl();
    }
}
