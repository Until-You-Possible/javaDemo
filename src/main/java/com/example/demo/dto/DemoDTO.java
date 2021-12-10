package com.example.demo.dto;

import org.springframework.lang.NonNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


public class DemoDTO {

    @NotBlank(message = "name 不能为空")
    private String name;
    @NotNull(message = "age 不能为空")
    private Integer age;
    @NotBlank(message = "age 不能为空")
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
