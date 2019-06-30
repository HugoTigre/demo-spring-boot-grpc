# Spring Boot gRPC Demo

## Build, Run and Test

    gradle clean build
     
    gradle bootRun -Dspring.profiles.active=default # Change profile acording to environment (local, dev, qa, prod, etc)

## Notes

Protobuf location: java/protobuf/HelloService.proto

Service class: kotlin/com/pakybytes/demo/springbootgrpc/core/services/HelloService.kt

Client class: kotlin/com/pakybytes/demo/springbootgrpc/client/HelloServiceClient.kt

Test: kotlin/com/pakybytes/demo/springbootgrpc/client/HelloServiceClientTest.kt

----
Hugo Tigre (hugo.tigre@gmail.com)

