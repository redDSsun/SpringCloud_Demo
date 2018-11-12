package com.sys.eureka_client_customer.service.impl;

import com.sys.eureka_client_customer.entity.Customer;
import com.sys.eureka_client_customer.mapper.CustomerMapper;
import com.sys.eureka_client_customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerMapper customerMapper;

    @Override
    public Customer findUserById(int id) {
        Customer customer = customerMapper.findCustomerbyId(id);
        return customer;
    }

    @Override
    public boolean addCustomer(Customer customer) {
        return customerMapper.addCustomer(customer) > 0;
    }

    @Override
    public boolean modifycustomer(Customer customer) {
        return customerMapper.modifyCustomer(customer) > 0;
    }

    @Override
    public List<Customer> getCustomerList(int page, int totalNum) {

        new Runnable() {
            @Override
            public void run() {
                System.out.println("this is thread!!");
                customerMapper.getCustomerList(page,totalNum);
            }
        };

        int startNum = ( page - 1 ) * totalNum;
        return customerMapper.getCustomerList(startNum,totalNum);
    }

    @Override
    public boolean deleteCustomer(int id) {
        return customerMapper.deleteCustomer(id) > 0;
    }
}
