package dev.marcosspano.dockerspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class Hello {

    @RestController
    public class Hello {
        @GetMapping("/hello")
        public String helloMessage() {

            return "Hello World";
        }
    }


}
