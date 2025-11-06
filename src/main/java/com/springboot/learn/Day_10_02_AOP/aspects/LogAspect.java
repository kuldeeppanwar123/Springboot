package com.springboot.learn.Day_10_02_AOP.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Before("@annotation(com.springboot.learn.Day_10_02_AOP.annotation.LogExecution)")
    public void before() {
        System.out.println("before method");
    }

    @AfterReturning("@annotation(com.springboot.learn.Day_10_02_AOP.annotation.LogExecution)")
    public void afterReturning() {
        System.out.println("afterReturning method");
    }

    @AfterThrowing("@annotation(com.springboot.learn.Day_10_02_AOP.annotation.LogExecution)")
    public void afterThrowing() {
        System.out.println("afterThrowing method");
    }

    @After("@annotation(com.springboot.learn.Day_10_02_AOP.annotation.LogExecution)")
    public void after() {
        System.out.println("after method");
    }

    @Around("@annotation(com.springboot.learn.Day_10_02_AOP.annotation.LogExecution)")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around method before calling actual method");
        joinPoint.proceed();
        System.out.println("around method after calling actual method");
    }
}
