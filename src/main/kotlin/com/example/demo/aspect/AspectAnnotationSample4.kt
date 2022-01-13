package com.example.demo.aspect

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

@Aspect
@Order(2)
@Component
class AspectAnnotationSample4 {

    @Around("@annotation(com.example.demo.annotation.SomeAnnotation)")
    fun testBefore(proceedingJoinPoint: ProceedingJoinPoint) {
        println("[annotation] [around] [before] order 2")
        proceedingJoinPoint.proceed()
        println("[annotation] [around] [after] order 2")
    }
}