package com.example.kotlinspringaoptest

import org.assertj.core.api.Assertions.assertThatCode
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory

internal class MyAspectUnitTest {

    @Test
    fun invoke() {
        val proxy = AspectJProxyFactory(MyAspectTestClass()).also {
            it.addAspect(MyAspect())
        }.getProxy<MyAspectTestClass>()

        assertThatCode { proxy.shouldNotBlock() }.doesNotThrowAnyException()
        assertThrows<BlockMeException> { proxy.shouldBlock() }
    }
}
