package com.fullstack.ecommerce.shopping.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Health {
    @Autowired

    private Environment environment;
    @GetMapping("/health")
    public Map<String, Object> health(){
        String dbUrl = environment.getProperty("spring.datasource.url");
        final Map<String, Object> response = new HashMap<>();
        response.put("status", "healthy");
        response.put("dbUrl", dbUrl);
        return response;
    }
}
