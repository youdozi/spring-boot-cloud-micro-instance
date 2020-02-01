package com.youdozi.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientController {

    @GetMapping("/eureka/client")
    public String eurekaClient() {
        return "eureka client - 1";
    }
}
