package com.example.shop.demo.dao;

import com.example.shop.demo.domain.Customer;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Component
public class CustomerDao {

    private Map<Long, Customer> customers = new ConcurrentHashMap<>();
    private AtomicLong customerIdSequence = new AtomicLong();

    public long createCustomer(Customer customer) {

        long newId = customerIdSequence.incrementAndGet();
        customer.setId(newId);
        customers.put(newId, customer);

        return newId;
    }
}
