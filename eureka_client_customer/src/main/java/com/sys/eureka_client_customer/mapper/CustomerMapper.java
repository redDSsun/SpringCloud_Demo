package com.sys.eureka_client_customer.mapper;

import com.sys.eureka_client_customer.entity.Customer;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CustomerMapper {

    @Select("SELECT * FROM customers WHERE id = #{id}")
    Customer findCustomerbyId(int id);

    @Select("select * from customers order by name desc limit #{startNum}, #{totalNum} ")
    List<Customer> getCustomerList(@Param("startNum") int startNum, @Param("totalNum") int totalNum);

    @Insert("insert into customers (name) values (#{name})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int addCustomer(Customer customer);

    @Update("update customers set name=#{name} where id=#{id}")
    int modifyCustomer(Customer customer);

    @Delete("delete from customers where id = #{id}")
    int deleteCustomer(int id);
}
