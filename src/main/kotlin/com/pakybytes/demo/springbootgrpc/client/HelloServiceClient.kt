package com.pakybytes.demo.springbootgrpc.client

import com.pakybytes.demo.springbootgrpc.core.HelloRequest
import com.pakybytes.demo.springbootgrpc.core.HelloServiceGrpc
import io.grpc.ManagedChannelBuilder
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class HelloServiceClient {

    val log = LoggerFactory.getLogger(HelloServiceClient::class.java)

    private var helloServiceBlockingStub: HelloServiceGrpc.HelloServiceBlockingStub? = null

    @PostConstruct
    private fun init() {
        val managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 6565).usePlaintext().build()

        helloServiceBlockingStub = HelloServiceGrpc.newBlockingStub(managedChannel)
    }

    fun sayHello(firstName: String, lastName: String): String? {
        val request = HelloRequest.newBuilder()
                .setFirstName(firstName)
                .setLastName(lastName)
                .build()
        log.info("client sending {}", request)

        val response = helloServiceBlockingStub?.hello(request)
        log.info("client received {}", response)

        return response?.greeting
    }

}