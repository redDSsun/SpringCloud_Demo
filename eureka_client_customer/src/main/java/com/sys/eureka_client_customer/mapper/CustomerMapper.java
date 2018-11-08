package com.sys.eureka_client_customer.mapper;

import com.sys.eureka_client_customer.entity.Customer;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CustomerMapper {

    @Select("SELECT * FROM customers WHERE id = #{id}")
    Customer findCustomerbyId(int id);

    @Insert("insert into customers (name) values (#{name})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int addCustomer(Customer customer);

    @Update("update customers set name=#{name} where id=#{id}")
    int modifyCustomer(Customer customer);
}
