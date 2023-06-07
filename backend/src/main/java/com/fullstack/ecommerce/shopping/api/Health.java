package com.fullstack.ecommerce.shopping.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Health {
    @GetMapping("/health")
    public String health(){
        return "Healthy";
    }
}
