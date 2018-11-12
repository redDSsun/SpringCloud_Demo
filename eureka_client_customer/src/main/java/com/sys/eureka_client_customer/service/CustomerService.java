package com.sys.eureka_client_customer.service;

import com.sys.eureka_client_customer.entity.Customer;

import java.util.List;

public interface CustomerService {

    Customer findUserById(int id);

    boolean addCustomer(Customer customer);

    boolean modifycustomer(Customer customer);

    List<Customer> getCustomerList(int page, int totalNum);

    boolean deleteCustomer(int id);
}
