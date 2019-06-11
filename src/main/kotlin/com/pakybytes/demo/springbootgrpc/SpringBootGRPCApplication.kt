package com.pakybytes.demo.springbootgrpc

import com.pakybytes.demo.springbootgrpc.conf.SpringBootGRPCConfig
import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(SpringBootGRPCConfig::class)
class SpringBootGRPCApplication

fun main(args: Array<String>) {
	runApplication<SpringBootGRPCApplication>(*args){
		setBannerMode(Banner.Mode.OFF)
	}
}
