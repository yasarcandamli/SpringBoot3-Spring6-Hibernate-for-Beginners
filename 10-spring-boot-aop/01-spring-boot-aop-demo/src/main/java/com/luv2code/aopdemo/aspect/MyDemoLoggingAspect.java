package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    // this is where we add all opf our related advices for logging

    // let's start with a @Before advice

    @Before("execution(public void add*())")
    public void beforeAddAccountAdvice() {
        System.out.println("\n =====>>> Executing @Before advice on addAccount()");
    }
}
