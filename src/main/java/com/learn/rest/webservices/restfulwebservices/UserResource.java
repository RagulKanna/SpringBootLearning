package com.learn.rest.webservices.restfulwebservices;

import org.hibernate.annotations.Any;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {

    //sampleSocialApp

    private UserDaoService service;

    public UserResource(UserDaoService service) {
        this.service = service;
    }


    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return service.findAll();
    }

    @RequestMapping("/users/{id}")
    public User retrieveSpecificUser(@PathVariable long id) {
            return service.findOne(id);
    }

    @PostMapping("/users/create")
    public ResponseEntity<Object> createUser(@RequestBody User user) {
        User savedUser = service.save(user);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
}
