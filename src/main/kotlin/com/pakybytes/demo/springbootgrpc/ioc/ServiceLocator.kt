package com.pakybytes.demo.springbootgrpc.ioc


import com.pakybytes.demo.springbootgrpc.conf.SpringBootGRPCConfig
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

/**
 * This class can be updated to access IoC Injector and used to inject objects
 * where standard dependency injection methods cannot be used, for example
 * in a static context. This should only be used as a last resort.
 */
@Component
object ServiceLocator {

    private val log = LoggerFactory.getLogger(this::class.java)

    @Autowired
    private lateinit var conf: SpringBootGRPCConfig

    init {
        log.warn("Starting Service Locator [$this]...")
    }
}