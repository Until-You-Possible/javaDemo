package com.example.demo.controller;


import com.example.demo.core.UnifyResponseSuccess;
import com.example.demo.exception.http.NotFoundException;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping
public class index {

    @GetMapping("/index/test")
    public UnifyResponseSuccess test() {
        String  name = "123456";
        Map<String, String> stringMap = new HashMap<>() {
            {
                put("name", "arthur");
                put("age", "18");
                put("area", "shanghai");
            }
        };
        if (!StringUtils.hasLength(name)) {
            throw new NotFoundException(10002);
        }
        return  new UnifyResponseSuccess(stringMap);
    }

}
