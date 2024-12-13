package com.eazybytes.accounts.mapper;


import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.entity.Customer;

public class CustomerMapper {

    public static CustomerDto mapToCustomerDto(Customer Customer, CustomerDto CustomerDto) {
        CustomerDto.setEmail(Customer.getEmail());
        CustomerDto.setMobileNumber(Customer.getMobileNumber());
        CustomerDto.setName(Customer.getName());
        return CustomerDto;
    }

    public static Customer mapToCustomer(CustomerDto CustomerDto, Customer Customer) {
        Customer.setEmail(CustomerDto.getEmail());
        Customer.setMobileNumber(CustomerDto.getMobileNumber());
        Customer.setName(CustomerDto.getName());
        return Customer;
    }


}
