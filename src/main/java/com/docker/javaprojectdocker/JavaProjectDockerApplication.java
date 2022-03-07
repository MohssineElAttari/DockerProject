package com.docker.javaprojectdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaProjectDockerApplication {
    @GetMapping("/welcome")
    public String welcome(){
        return "welcome to docker project";
    }
    public static void main(String[] args) {
        SpringApplication.run(JavaProjectDockerApplication.class, args);

    }

}
