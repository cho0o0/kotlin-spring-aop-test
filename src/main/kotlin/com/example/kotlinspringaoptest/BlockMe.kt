package com.example.kotlinspringaoptest

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class BlockMe(val shouldBlock: Boolean)
