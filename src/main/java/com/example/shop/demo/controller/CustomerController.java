package com.example.shop.demo.controller;

import com.example.shop.demo.request.dto.CustomerRegistrationRequest;
import com.example.shop.demo.response.dto.CustomerRegistrationResult;
import com.example.shop.demo.service.CustomerService;

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

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public ResponseEntity registerCustomer(@Valid @RequestBody CustomerRegistrationRequest customerRegistrationRequest) {

        long id = customerService.registerCustomer(customerRegistrationRequest);

        CustomerRegistrationResult result = new CustomerRegistrationResult(id);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
}
