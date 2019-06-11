package com.pakybytes.demo.springbootgrpc

import com.pakybytes.demo.springbootgrpc.conf.SpringBootGRPCConfig
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.context.ApplicationContext
import org.springframework.core.Ordered
import org.springframework.stereotype.Component


/**
 * This class demonstrates how to use command line arguments
 */
@Component
class Startup : CommandLineRunner, Ordered {

    @Autowired
    private lateinit var conf: SpringBootGRPCConfig

    @Autowired
    private lateinit var ctx: ApplicationContext

    private val log = LoggerFactory.getLogger(Startup::class.java)

    override
    fun getOrder() = 1

    override
    fun run(vararg args: String?) {
        log.debug("App name: ${conf.app.name}")
        log.debug("Using environment: ${conf.env}")
    }
}