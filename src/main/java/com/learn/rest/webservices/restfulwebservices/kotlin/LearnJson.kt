package com.learn.rest.webservices.restfulwebservices.kotlin

data class LearnJson(var message: String) {

    override fun toString(): String {
        return "LearnJson{" +
                "message='" + message + '\'' +
                '}'
    }
}