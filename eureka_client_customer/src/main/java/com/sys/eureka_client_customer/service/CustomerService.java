package com.sys.eureka_client_customer.service;

import com.sys.eureka_client_customer.entity.Customer;

public interface CustomerService {

    Customer findUserById(int id);

    boolean addCustomer(Customer customer);

    boolean modifycustomer(Customer customer);
}
