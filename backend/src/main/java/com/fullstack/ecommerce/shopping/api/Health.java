package com.fullstack.ecommerce.shopping.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Health {
    @Autowired

    @GetMapping("/health")
    public Map<String, Object> health(){
        final Map<String, Object> response = new HashMap<>();
        response.put("status", "healthy");
        return response;
    }
}
