package org.example.dockerapplication_feb2025;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String print() {
        return "Hello World";
    }
}
