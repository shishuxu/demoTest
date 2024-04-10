package com.xss.test.controller;

import com.xss.test.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试类
 */
@RequestMapping("api/")
@RestController
public class HelloWordController {
    @Autowired
    private HelloWorldService helloWorldService;
    /**
     * 验证mybatis的批处理
     * @return 、、
     */
    @GetMapping(value = "test")
    public Object testBatchInsert(){
        long a = System.currentTimeMillis();
        helloWorldService.batchInsertUsers();
        System.out.println(System.currentTimeMillis() - a);
        return "1o1k";
    }


    /**
     * 验证mybatis的批处理
     * @return 、、
     */
    @GetMapping(value = "testAop")
    public Object testAop(){
        System.out.println("testAop");

//        helloWorldService.testAop();
        return "testAop";
    }

    /**
     * 验证mybatis的批处理
     * @return 、、
     */
    @GetMapping(value = "/testJenkins")
    public Object test(){
        System.out.println("testJenkins");
        return "testJenkins";
    }
}
