package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
   @GetMapping(path = "/hello-world")
   public String helloWorld() {
       return "hello world ";
   }

   @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
       return new HelloWorldBean("Hello");
   }

   @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldBeanPath(@PathVariable String name) {
       return new HelloWorldBean(name);
   }
}
