package com.example.kotlinspringaoptest

import org.springframework.stereotype.Component

@Component
internal class MyAspectTestClass {
    @BlockMe(shouldBlock = true)
    fun shouldBlock() {
        println("should block me")
    }
    @BlockMe(shouldBlock = false)
    fun shouldNotBlock() {
        println("should not block me")
    }
}
