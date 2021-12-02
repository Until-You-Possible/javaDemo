package com.example.demo.core.configuration;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@PropertySource(value = "classpath:exception-code.properties")
@ConfigurationProperties(prefix = "gang")
public class ExceptionCodeConfiguration {

    public Map<Integer, String> getCodes() {
        return codes;
    }

    private final Map<Integer, String>  codes = new HashMap<>();

    public String getMessage(int code) {
        return  codes.get(code);
    }
}
