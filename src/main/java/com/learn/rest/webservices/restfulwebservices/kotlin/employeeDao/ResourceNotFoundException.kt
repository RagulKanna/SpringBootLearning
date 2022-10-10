package com.learn.rest.webservices.restfulwebservices.kotlin.employeeDao

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus
import java.lang.RuntimeException

@ResponseStatus(value = HttpStatus.NOT_FOUND)
data class ResourceNotFoundException(
    val resourceName: String = "",
    val fieldName: String = "",
    val fieldValue: Any? = null
) : RuntimeException() {

    override fun toString(): String {
        return "'$resourceName' is not found with '$fieldName',$fieldValue"
    }
}