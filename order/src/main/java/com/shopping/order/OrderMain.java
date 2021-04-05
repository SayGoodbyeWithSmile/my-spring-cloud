package com.shopping.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author osmondy
 * @create 2021/4/4 19:14
 */
@ComponentScan(basePackages = {"com.shopping.*"})
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class OrderMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain.class, args);
    }
}
