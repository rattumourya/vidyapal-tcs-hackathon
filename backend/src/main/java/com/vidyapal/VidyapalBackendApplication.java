package com.vidyapal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class VidyapalBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(VidyapalBackendApplication.class, args);
    }

    @RestController
    static class HelloController {
        @GetMapping("/api/hello")
        public String hello() {
            return "Vidyapal backend prototype";
        }
    }
}
