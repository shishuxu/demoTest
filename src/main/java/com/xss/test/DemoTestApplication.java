package com.xss.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@MapperScan(basePackages = {"com.xss.test.mapper"})
@SpringBootApplication
public class DemoTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoTestApplication.class, args);
    }

}
