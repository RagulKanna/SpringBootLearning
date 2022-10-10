package com.learn.rest.webservices.restfulwebservices.java;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    //RequestMapping for postman and browser

    //Passing Request Body
    @PostMapping("/hello")
    public String helloWorld(@RequestBody String id) {
        return id + "hey ragul";
    }

    @GetMapping(path = "/learn")
    public String learn() {
        return "hey Sinamika-Radha";
    }

    @RequestMapping(path = "/learn-json")
    public LearnJson learnJson() {
        return new LearnJson("Hello All");
    }

    //path Parameter
    @RequestMapping(path = "/learn-json/{hello}/{name}")
    public LearnJson learPathJson(@PathVariable String name, @PathVariable String hello) {
        return new LearnJson(hello + " " + name);
    }
}
