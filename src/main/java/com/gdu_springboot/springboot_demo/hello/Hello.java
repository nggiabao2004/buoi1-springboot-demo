package com.gdu_springboot.springboot_demo.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/")
    public String hello() {
        return "<h1>Hello World!</h1>";
    }
    @GetMapping("/aboutus")
    public String abboutUs() {
        return "<h1>About Us</h1>";
    }
}
