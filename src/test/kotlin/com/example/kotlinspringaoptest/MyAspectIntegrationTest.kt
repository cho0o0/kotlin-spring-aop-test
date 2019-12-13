package com.example.kotlinspringaoptest

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.EnableAspectJAutoProxy

@SpringBootTest
@EnableAspectJAutoProxy
internal class MyAspectIntegrationTest(
    @Autowired private val proxy: MyAspectTestClass
) {
    @Test
    fun invoke() {
        Assertions.assertThatCode { proxy.shouldNotBlock() }.doesNotThrowAnyException()
        assertThrows<BlockMeException> { proxy.shouldBlock() }
    }
}
