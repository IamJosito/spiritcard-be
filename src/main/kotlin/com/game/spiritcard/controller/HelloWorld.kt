package com.game.spiritcard.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorld {
    @GetMapping("/")
    fun helloWorld(): ResponseEntity<String> {
        return ResponseEntity.ok("Spring boot test!")
    }
}