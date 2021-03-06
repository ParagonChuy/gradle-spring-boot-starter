package com.chikli.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class SpringBootApplicationExample {

    @RequestMapping("/cool-endpoint")
    public String coolWebServiceMethodName() {
       return "some cool web service data";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationExample.class, args);
    }
}

