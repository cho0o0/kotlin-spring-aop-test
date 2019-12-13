package com.example.kotlinspringaoptest

import mu.KotlinLogging
import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.reflect.MethodSignature
import org.springframework.stereotype.Component

@Aspect
@Component
class MyAspect {
    private val log = KotlinLogging.logger {}

    @Before("@annotation(BlockMe)")
    fun invoke(joinPoint: JoinPoint) {
        val signature = joinPoint.signature as MethodSignature
        val shouldBlock = signature.method
                .getAnnotation(BlockMe::class.java).shouldBlock
                .also { result -> log.debug { "Should${if (result) {" "} else " not "}be blocked" } }
        if (shouldBlock) throw BlockMeException()
    }
}
