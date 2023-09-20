package com.itxz2.springbootweb2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String rehello() {
        System.out.println("hello spring");
        return "hello spring";
    }
}
