package com.learn.rest.webservices.restfulwebservices;


import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import java.util.List;

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
        return "hey Sinamika";
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
