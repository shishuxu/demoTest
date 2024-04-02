package com.xss.test.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * aop 配置
 *
 * @author xss
 * @version 1.0
 * @date 2024/0322
 * @since 2024-03-22 16:36:39
 */
@Aspect
@Component
public class AopTest {
    // 注解的参数是需要拦截的包
    @Pointcut("execution(* com.xss.test.services..*(..))")
    public void PointCut() {
    //切点，不能有方法体。
    }

    @Before("execution(* com.xss.test.services..*(..))")
    public void Before() {
        System.out.println("请求之前");
    }

    @Around("execution(* com.xss.test.services..*(..))")
    public Object Around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕");
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("type 为：-" + method.getName());
        return joinPoint.proceed();
    }

    @After("execution(* com.xss.test.services..*(..))")
    public void After() {
        System.out.println("在请求之后");
    }

    @AfterReturning("execution(* com.xss.test.services..*(..))")
    public void AfterReturning() {
        System.out.println("在返回之后");
    }

}

