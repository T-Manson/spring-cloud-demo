package com.demo.configclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//指定为Eureka客户端
@EnableEurekaClient
@SpringBootApplication
public class ConfigClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient2Application.class, args);
    }
}
