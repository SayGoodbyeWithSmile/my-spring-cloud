package com.shopping.payment.service;

import com.shopping.payment.domain.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author osmondy
 * @create 2021/4/4 19:02
 */
public interface PaymentService {

    public Integer create(Payment payment); //写

    public Payment getPaymentById(@Param("id") Long id);
}
