package com.example.demo.exception.http;

import com.example.demo.exception.http.HttpException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends HttpException {

    public NotFoundException(int code) {
        this.code = code;
        this.httpStatusCode = 404;
    }

}
