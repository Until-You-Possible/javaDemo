package com.example.demo.core;


import com.example.demo.core.configuration.ExceptionCodeConfiguration;
import com.example.demo.exception.http.HttpException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@RestControllerAdvice
public class GlobalHttpException extends ResponseEntityExceptionHandler {


    private  ExceptionCodeConfiguration exceptionCodeConfiguration;
    public GlobalHttpException(ExceptionCodeConfiguration exceptionCodeConfiguration) {
        this.exceptionCodeConfiguration = exceptionCodeConfiguration;
    }

    public GlobalHttpException() {
        super();
    }


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
        UnifyResponse unifyResponse = new UnifyResponse(httpException.getCode(),
                exceptionCodeConfiguration.getMessage(httpException.getCode()), method + "" + requestUrl);
        HttpHeaders httpHeaders =  new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpStatus httpStatus = HttpStatus.resolve(httpException.getHttpStatusCode());
        if (httpStatus == null) {
            return new ResponseEntity<>(unifyResponse, httpHeaders, 500);
        }
        return new ResponseEntity<>(unifyResponse, httpHeaders, httpStatus);
    }
    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public HashMap<String, String> handleNoHandlerFound(NoHandlerFoundException e, WebRequest request) {
        HashMap<String, String> response = new HashMap<>();
        response.put("status", "fail");
        response.put("message", e.getLocalizedMessage());
        return response;
    }

}
