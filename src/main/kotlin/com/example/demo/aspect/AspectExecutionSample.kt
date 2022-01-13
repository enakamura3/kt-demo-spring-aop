package com.example.demo.aspect

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.After
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

@Aspect
@Order(1)
@Component
class AspectExecutionSample {

    @Before("execution(* com.example.demo.Hello.sayHello(*))")
    fun testBefore() {
        println("[execution] [before]")
    }

    @Around("execution(* *sayHello(*))")
    fun testAround(proceedingJoinPoint: ProceedingJoinPoint) {
        println("[execution] [around] [before]")
        proceedingJoinPoint.proceed()
        println("[execution] [around] [after]")
    }

    @After("execution(* com.example.demo.Hello.sayHello(*))")
    fun testAfter(joinPoint: JoinPoint) {
        print("[execution] [after]")
        println("[using the joinPoint variable to print the method name: '${joinPoint.signature.name}']")
    }

}