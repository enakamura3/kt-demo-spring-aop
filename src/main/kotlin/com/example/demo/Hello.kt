package com.example.demo

import org.springframework.stereotype.Component

@Component
class Hello {
    fun saySomething(message: String) = println(message)
    fun sayHello(name: String) = println("Hello $name!")
}