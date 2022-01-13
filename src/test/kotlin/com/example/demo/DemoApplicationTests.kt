package com.example.demo

import com.example.demo.annotation.SomeAnnotation
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    lateinit var hello: Hello

    @Autowired
    lateinit var goodBye: GoodBye

    @Test
    fun testExecution() {
        hello.sayHello("Bob 1")
    }

    @Test
    @SomeAnnotation
    fun testAnnotation() {
        hello.sayHello("Bob 2")
    }

    @Test
    fun testAnnotation2() {
        goodBye.sayGoodBye("Bob 3")
    }
}
