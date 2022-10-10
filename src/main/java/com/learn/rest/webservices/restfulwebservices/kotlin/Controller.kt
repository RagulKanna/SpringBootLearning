package com.learn.rest.webservices.restfulwebservices.kotlin

import org.springframework.web.bind.annotation.*

@RestController
class Controller {
    //RequestMapping for postman and browser
    //Passing Request Body
    @PostMapping("/hello")
    fun helloWorld(@RequestBody id: String): String {
        return id + "hey ragul"
    }

    @GetMapping(path = ["/learn"])
    fun learn(): String {
        return "hey Sinamika"
    }

    @RequestMapping(path = ["/learn-json"])
    fun learnJson(): LearnJson {
        return LearnJson("Hello All")
    }

    //path Parameter
    @RequestMapping(path = ["/learn-json/{hello}/{name}"])
    fun learPathJson(@PathVariable name: String, @PathVariable hello: String): LearnJson {
        return LearnJson("$hello $name")
    }
}