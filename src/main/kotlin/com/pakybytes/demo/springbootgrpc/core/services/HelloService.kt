package com.pakybytes.demo.springbootgrpc.core.services


import com.pakybytes.demo.springbootgrpc.core.HelloRequest
import com.pakybytes.demo.springbootgrpc.core.HelloResponse
import com.pakybytes.demo.springbootgrpc.core.HelloServiceGrpc
import io.grpc.stub.StreamObserver
import org.lognet.springboot.grpc.GRpcService
import org.slf4j.LoggerFactory

@GRpcService
class HelloService : HelloServiceGrpc.HelloServiceImplBase() {

    private val log = LoggerFactory.getLogger(HelloService::class.java)

    override
    fun hello(request: HelloRequest, responseObserver: StreamObserver<HelloResponse>) {

        log.info("Received new request...")

        val greeting = StringBuilder()
                .append("Hello, ")
                .append(request.firstName)
                .append(" ")
                .append(request.lastName)
                .toString()

        val response = HelloResponse.newBuilder()
                .setGreeting(greeting)
                .build()

        responseObserver.onNext(response)
        responseObserver.onCompleted()
    }

}