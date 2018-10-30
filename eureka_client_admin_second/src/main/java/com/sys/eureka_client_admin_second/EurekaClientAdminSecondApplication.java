package com.sys.eureka_client_admin_second;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RequestMapping("/admin")
public class EurekaClientAdminSecondApplication {

    @RequestMapping("/hello")
    public String sayHello(){
        return "hello admin, welcome!! This is second!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientAdminSecondApplication.class, args);
    }
}
