package com.example.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
//
//    @Before("execution(* com.example.aop.Service.MyService.displayMessage(..))")
//    public void beforeAdvice() {
//        System.out.println("Before Business Method");
//    }
//
//    @After("execution(* com.example.aop.Service.MyService.displayMessage(..))")
//    public void afterAdvice() {
//        System.out.println("After Business Method");
//    }


    @Before("execution(* com.example.aop.Service.MyService.interviewDone(..))")
    public void beforeInterview() {
        System.out.println("Prep started");
    }

    @After("execution(* com.example.aop.Service.MyService.interviewDone(..))")
    public void afterInterview() {
        System.out.println("Food  taken");
    }
}