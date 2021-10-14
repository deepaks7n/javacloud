package com.template.java.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    
    @GetMapping("/hello")
  String sayHello() {
    return "hello, dev";
  }
}
