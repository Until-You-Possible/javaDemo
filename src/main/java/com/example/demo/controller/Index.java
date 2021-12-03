package com.example.demo.controller;


import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.example.demo.core.UnifyResponseSuccess;
import com.example.demo.exception.http.NotFoundException;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping
public class Index {

    private static String jwtKey;

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

    public static void main(String[] args) {
        String str = "abc";

        try {
            int i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("运行完毕");
        }
        //
        Index throwEx = new Index();

        throwEx.setAge(-5);
    }


        // 手动抛出运行时异常
        public void setAge(int age) {
            if (age < 0) {
                throw new NullPointerException("输入的年龄小于0");
            }
        }

        // 手动抛出编译时异常
        public static void setAge2(int age) throws FileNotFoundException {
            if (age < 0) {
                throw new FileNotFoundException("输入的年龄小于0");
            }
        }

        public static void TestsetAge2() throws FileNotFoundException {
            setAge2(2);
        }


}
