package com.example.SpringDemo.controller;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/my")
public class MyController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello from BridgeLabz";
    }

    @PutMapping("/hello/{name}")
    public String hello1(@PathVariable String name ) {
        return name+"!!  Hello from BridgeLabz";

    }@PostMapping("/hellobybody")


    public String hello2(@RequestBody MyClass myClass ) {
        System.out.println(myClass.getName());
        return myClass.getName()+"!! Hello from BridgeLabz";
    }
    @PostMapping("/hellobyparam")
    public String hello3(@RequestParam("name") String name) {

        return name+"!!  Hello from BridgeLabz";
    }
}
