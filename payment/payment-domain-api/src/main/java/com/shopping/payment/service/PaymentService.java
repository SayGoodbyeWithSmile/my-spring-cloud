package com.shopping.payment.service;

import com.shopping.payment.entity.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author osmondy
 * @create 2021/4/4 19:02
 */
@Service
@FeignClient(value = "payment")
public interface PaymentService {

    @PostMapping(value = "/payment/create")
    Integer create(@RequestBody Payment payment); //写

    @GetMapping(value = "/payment/get/{id}")
    Payment getPaymentById(@Param("id") Long id);
}
