package com.game.spiritcard.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorld {
    @GetMapping("/")
    fun helloWorld(): String {
        return "Hello World!"
    }
}