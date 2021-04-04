package com.shopping.order.service;

import com.shopping.order.domain.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author osmondy
 * @create 2021/4/4 19:02
 */
@FeignClient(value = "payment")
public interface PaymentService {

//    @GetMapping(value = "/payment/get/{id}")
//    Integer create(Payment payment); //写

    @GetMapping(value = "/payment/get/{id}")
    Payment getPaymentById(@PathVariable("id") Long id);
}
