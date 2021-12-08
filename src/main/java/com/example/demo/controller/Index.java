package com.example.demo.controller;


import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.example.demo.core.UnifyResponseSuccess;
import com.example.demo.exception.http.NotFoundException;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping
public class Index {


    @GetMapping("/index/test")
    public UnifyResponseSuccess test() {
        String  name = "45677";
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
