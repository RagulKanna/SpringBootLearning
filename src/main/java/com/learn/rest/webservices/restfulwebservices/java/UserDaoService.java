package com.learn.rest.webservices.restfulwebservices.java;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    private static Integer userId = 1;

    static {
        users.add(new User(userId++, "ragul", LocalDate.now().minusYears(23)));
        users.add(new User(userId++, "alagu", LocalDate.now().minusYears(30)));
        users.add(new User(userId++, "chandrasekar", LocalDate.now().minusYears(35)));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        user.setId(userId++);
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        Predicate<? super User> predicate = user ->
                user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().get();
    }
}
