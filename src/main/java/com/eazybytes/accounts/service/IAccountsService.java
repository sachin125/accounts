package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     * Creates a new account for the given customer.
     *
     * @param customerDto an object containing the customer's details required for account creation
     */
    void createAccount(CustomerDto customerDto);



}
