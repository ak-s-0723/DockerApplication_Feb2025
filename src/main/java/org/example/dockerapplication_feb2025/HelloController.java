package org.example.dockerapplication_feb2025;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "Hello "+name;
    }
}
