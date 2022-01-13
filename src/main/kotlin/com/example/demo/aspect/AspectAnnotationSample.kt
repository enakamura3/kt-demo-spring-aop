package com.example.demo.aspect

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

@Aspect
@Order(5)
@Component
class AspectAnnotationSample {

    @Before("@annotation(com.example.demo.annotation.SomeAnnotation)")
    fun testBefore(joinPoint: JoinPoint) {
        println("[annotation] [before] order 5")
    }
}