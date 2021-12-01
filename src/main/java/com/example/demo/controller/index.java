package com.example.demo.controller;


import com.example.demo.exception.http.NotFoundException;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class index {

    @GetMapping("/index/test")
    public String test() {
        String  name = "";
        if (!StringUtils.hasLength(name)) {
            throw new NotFoundException(10001);
        }
        return "13245";
    }

}
