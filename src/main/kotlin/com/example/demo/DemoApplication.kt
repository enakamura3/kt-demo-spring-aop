package com.example.demo

import com.example.demo.annotation.SomeAnnotation
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
    val hello = Hello()
    hello.saySomething("Text from main")
}

@Component
@SomeAnnotation // <-- annotation does not work here
class Test(val hello: Hello) {

    @SomeAnnotation // <-- annotation works here
    @Bean
    fun run() {
        hello.saySomething("Text from Spring bean")
        hello.sayHello("John")
    }
}
