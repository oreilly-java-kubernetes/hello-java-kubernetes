package com.albertoimpl.hellojavakubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloJavaKubernetesApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloJavaKubernetesApplication.class, args);
    }

    @RestController
    class HelloController {

        @GetMapping("/hello")
        public String hello() {
            return "Hello, world";
        }

    }

}
