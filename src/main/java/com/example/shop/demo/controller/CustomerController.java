package com.example.shop.demo.controller;

import com.example.shop.demo.request.dto.CustomerRegistrationRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

    @PostMapping
    public ResponseEntity registerCustomer(@Valid @RequestBody CustomerRegistrationRequest customer) {
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
