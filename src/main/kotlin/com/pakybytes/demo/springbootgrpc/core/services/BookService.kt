package com.pakybytes.demo.springbootgrpc.core.services


import com.pakybytes.demo.springbootgrpc.core.services.status.StatusService
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class BookService(val statusServ: StatusService) {

    private val log = LoggerFactory.getLogger(BookService::class.java)

    private val queryTimeout = 5000L

}