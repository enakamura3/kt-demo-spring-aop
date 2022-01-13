package com.example.demo

import com.example.demo.annotation.SomeAnnotation
import org.springframework.stereotype.Component

@Component
class GoodBye {

    @SomeAnnotation
    fun sayGoodBye(name: String){
        println("Good bye $name!")
    }
}