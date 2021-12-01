package com.example.demo.core;


import com.example.demo.exception.http.HttpException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalHttpException {


    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public UnifyResponse handleException(HttpServletRequest httpServletRequest, Exception e) {
        String url = httpServletRequest.getRequestURI();
        String method = httpServletRequest.getMethod();
        return new UnifyResponse(9999, "serve error",  method + "" + url);
    }

    @ExceptionHandler(value = HttpException.class)
    public ResponseEntity<UnifyResponse> handleHttpException(HttpServletRequest httpServletRequest, HttpException httpException) {
        // 设置自定义的code header
        // 设置自定义的报错信息 从配置中读取相关信息
        String requestUrl = httpServletRequest.getRequestURI();
        String method =  httpServletRequest.getMethod();
        UnifyResponse unifyResponse = new UnifyResponse(httpException.getCode(), "this is http exception", method + "" + requestUrl);
        HttpHeaders httpHeaders =  new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpStatus httpStatus = HttpStatus.resolve(httpException.getHttpStatusCode());
        if (httpStatus == null) {
            return new ResponseEntity<>(unifyResponse, httpHeaders, 500);
        }

        return new ResponseEntity<>(unifyResponse, httpHeaders, httpStatus);
    }

}
