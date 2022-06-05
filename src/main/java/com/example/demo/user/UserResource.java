package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {

   @Autowired
   private UserDaoService userDaoService;

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return userDaoService.findAll() ;
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Integer id) {
       return userDaoService.findOne(id);
    }

    @PostMapping("/users")
    public User saveUser(@RequestBody User user) throws Exception {
        if (user.getBirthDate() == null || user.getName() == null) {
            throw new Exception("bad request");
        }

        User savedUser = userDaoService.save(user);
        return savedUser;
    }
}
