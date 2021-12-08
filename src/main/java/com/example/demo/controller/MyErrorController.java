package com.example.demo.controller;

import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//
//@Controller
//public class MyErrorController extends BasicErrorController {
////    public MyErrorController(ErrorAttributes errorAttributes, ErrorProperties errorProperties) {
////        super(errorAttributes, errorProperties);
////    }
//
//    /**
//     * 覆盖默认的json
//     */
//
//    public ResponseEntity<Map<String, Object>> error(HttpServletRequest request) {
////        Map<String, Object> objectMap = getErrorAttributes(request, isIncludeStackTrace(request, MediaType.ALL));
////        HttpStatus status = getStatus(request);
////        Map<String, Object> map = new HashMap<String, Object>();
////        map.put("status", false);
////        map.put("msg", body.get("message"));
////        return new ResponseEntity<Map<String, Object>>(map, status);
//    }
//
//}
