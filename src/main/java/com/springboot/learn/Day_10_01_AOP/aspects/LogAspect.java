package com.springboot.learn.Day_10_01_AOP.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Pointcut("execution(* com.springboot.learn.Day_10_01_AOP.service.*.*(..))")
    public void vehicleService() {}

    @Before("vehicleService()")
    public void before() {
        System.out.println("before method");
    }

    @AfterReturning("vehicleService()")
    public void afterReturning() {
        System.out.println("afterReturning method");
    }

    @AfterThrowing("vehicleService()")
    public void afterThrowing() {
        System.out.println("afterThrowing method");
    }

    @After("vehicleService()")
    public void after() {
        System.out.println("after method");
    }

    @Around("vehicleService()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around method before calling actual method");
        joinPoint.proceed();
        System.out.println("around method after calling actual method");
    }
}
