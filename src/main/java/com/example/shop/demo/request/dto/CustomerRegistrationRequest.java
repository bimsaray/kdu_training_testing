package com.example.shop.demo.request.dto;


import javax.validation.constraints.Email;

public class CustomerRegistrationRequest {

    private String name;

    @Email(message = "Invalid Email")
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
