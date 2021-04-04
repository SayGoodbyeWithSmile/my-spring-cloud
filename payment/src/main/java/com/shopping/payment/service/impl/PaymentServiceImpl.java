package com.shopping.payment.service.impl;

import com.shopping.payment.dao.PaymentDao;
import com.shopping.payment.domain.Payment;
import com.shopping.payment.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author osmondy
 * @create 2021/4/4 19:03
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public Integer create(Payment payment){
        return paymentDao.insert(payment);
    }

    @Override
    public Payment getPaymentById(Long id){
        return paymentDao.selectById(id);

    }
}
