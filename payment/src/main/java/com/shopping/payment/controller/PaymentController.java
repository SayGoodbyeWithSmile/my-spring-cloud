package com.shopping.payment.controller;

import com.shopping.payment.domain.Payment;
import com.shopping.payment.dto.CommonResult;
import com.shopping.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author osmondy
 * @create 2021/4/4 19:10
 */
@Slf4j
@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String port;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("*****插入结果："+result);
        if (result>0){
            return new CommonResult(200,"插入数据库成功",result);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }
    @GetMapping(value = "/payment/get/{id}")
    public Payment getPaymentById(@PathVariable("id") Long id){
        log.info("------端口号：" + port);
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果："+payment);
        return payment;
    }

}
