package com.example.shop.demo.service

import com.example.shop.demo.dao.CustomerDao
import com.example.shop.demo.request.dto.CustomerRegistrationRequest
import spock.lang.Specification

class CustomerServiceTest extends Specification {

    CustomerDao customerDao = Mock(CustomerDao)
    CustomerService customerService

    def setup() {
        customerService = new CustomerService(customerDao)
    }

    def "RegisterCustomer - Returns the Customer Id"() {
        given:
            customerDao.createCustomer(_) >> 1L

        when:
            long id = customerService.registerCustomer(new CustomerRegistrationRequest(
                name: "123"
            ))

        then:
            id == 1
    }
}
