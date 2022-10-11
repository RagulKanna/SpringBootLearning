package com.learn.rest.webservices.restfulwebservices.kotlin

import org.hibernate.annotations.common.util.impl.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RestfulWebServicesApplicationKotlin

private val log = LoggerFactory.logger(RestfulWebServicesApplicationKotlin::class.java)

fun main(args: Array<String>) {
    runApplication<RestfulWebServicesApplicationKotlin>(*args)
}