package com.pakybytes.demo.springbootgrpc.conf

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("spring-boot-grpc")
class SpringBootGRPCConfig {

    lateinit var env: String

    var logRequests: Boolean = false
    var logResponses: Boolean = false

    val app = App()

    class App {
        lateinit var name: String
        lateinit var version: String
        lateinit var secret: String
    }
}