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

    /**
     *
     * @param customerDto - CustomerDto Object
     * @return boolean indicating if the update of Account details is successful or not
     */
    boolean updateAccount(CustomerDTO customerDto);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return boolean indicating if the delete of Account details is successful or not
     */
    boolean deleteAccount(String mobileNumber);
}
