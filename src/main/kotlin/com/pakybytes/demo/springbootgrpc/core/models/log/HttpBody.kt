package com.pakybytes.demo.springbootgrpc.core.models.log

data class HttpBody(
        val content: List<String>?,
        val size: Int?
)