package com.pakybytes.demo.springbootgrpc.client

import common.UnitTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@UnitTest
@DisplayName("Book Service Unit Tests")
@SpringBootTest
internal class HelloServiceClientTest {

    @Autowired
    private lateinit var helloClient: HelloServiceClient

    @Test
    fun sayHello() {
        val result = helloClient.sayHello("Maria", "Albertina")
        assertEquals("Hello, Maria Albertina", result)
    }
}