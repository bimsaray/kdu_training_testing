package com.example.shop.demo.request.dto;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class CustomerRegistrationRequest {

    private String name;

    @Email(message = "Invalid Email")
    private String email;

    @NotEmpty(message = "Empty city is not allowed")
    private String city;

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
