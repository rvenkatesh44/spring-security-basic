package com.springfundamentals.spring.security.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "Welcome to Spring Security home !!!";
    }
    @GetMapping("/admin")
    public String admin() {
        return "Welcome to admin!!!!";
    }
}
