package com.learn.rest.webservices.restfulwebservices.kotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
class RestfulWebServicesApplicationKotlin

fun main(args: Array<String>) {
    runApplication<RestfulWebServicesApplicationKotlin>(*args)
}