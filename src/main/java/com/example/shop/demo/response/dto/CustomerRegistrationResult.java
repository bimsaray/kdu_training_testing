package com.example.shop.demo.response.dto;

public class CustomerRegistrationResult {

    private long id;

    public CustomerRegistrationResult(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
