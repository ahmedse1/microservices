package com.example.accounts.service;

import com.example.accounts.dto.CustomerDTO;

public interface IAccountsService {

    /**
     *
     * @param customerDTO - CustomerDTO object
     */
    void createAccount(CustomerDTO customerDTO);


    /**
     *
     * @param mobileNumber
     * @return Account details based on given mobile number
     */
    CustomerDTO fetchAccount(String mobileNumber);
}
