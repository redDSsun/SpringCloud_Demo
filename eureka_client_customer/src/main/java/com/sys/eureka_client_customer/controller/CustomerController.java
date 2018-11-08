package com.sys.eureka_client_customer.controller;

import com.sys.eureka_client_customer.entity.Customer;
import com.sys.eureka_client_customer.service.CustomerService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {


    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Customer getCustomer(@PathVariable("id") int id){

        Customer customer = customerService.findUserById(id);
        return customer;
    }

    @RequestMapping(value = "/{name}",method = RequestMethod.POST)
    public boolean addCustomer(@PathVariable("name") String name){
        Customer customer = new Customer();
        customer.setName(name);
        return customerService.addCustomer(customer);
    }

    @RequestMapping(value = "/list", method=RequestMethod.POST)
    public boolean listAddcustomer(@RequestParam("customerList")List<String> customerList){
        boolean isAllSuccess = true;
        for (String name: customerList) {
            if(!addCustomer(name)){
                isAllSuccess = false;
            };
        }
        return isAllSuccess;
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public boolean modifyCustomer(@RequestParam("id")int id,
                                  @RequestParam("value") String value){
        Customer customer = new Customer();
        customer.setName(value);
        customer.setId(id);
        return customerService.modifycustomer(customer);
    }
}
