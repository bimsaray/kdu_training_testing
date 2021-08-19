package com.example.shop.demo.service;

import com.example.shop.demo.dao.CustomerDao;
import com.example.shop.demo.domain.Customer;
import com.example.shop.demo.request.dto.CustomerRegistrationRequest;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerDao customerDao;

    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public long registerCustomer(CustomerRegistrationRequest customerRegistrationRequest) {

        Customer customer = convertRegistrationRequestToCustomer(customerRegistrationRequest);

        return customerDao.createCustomer(customer);
    }

    private Customer convertRegistrationRequestToCustomer(CustomerRegistrationRequest customerRegistrationRequest) {

        Customer customer = new Customer();
        customer.setName(customerRegistrationRequest.getName());
        customer.setEmail(customerRegistrationRequest.getEmail());

        return customer;
    }
}
