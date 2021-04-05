package com.shopping.payment.service.impl;

import com.shopping.payment.dao.PaymentDao;
import com.shopping.payment.entity.Payment;
import com.shopping.payment.entity.PaymentPO;
import com.shopping.payment.factory.PaymentFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author osmondy
 * @create 2021/4/4 19:03
 */
@Slf4j
@RestController
public class PaymentServiceImpl {
    @Resource
    private PaymentDao paymentDao;
    @Autowired
    PaymentFactory paymentFactory;

    @PostMapping(value = "/payment/create")
    public Integer create(Payment payment){
        PaymentPO paymentPo = paymentFactory.buildPaymentPo(payment);
        return paymentDao.insert(paymentPo);
    }

    @GetMapping(value = "/payment/get/{id}")
    public Payment getPaymentById(Long id){
        PaymentPO paymentPo = paymentDao.selectById(id);
        return paymentFactory.buildPayment(paymentPo);
    }
}
