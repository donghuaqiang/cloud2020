package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author
 * @create 2020-11-09 16:54
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_Ok(Integer id) {
        return "PaymentHystrixService fallback paymentInfo_Ok,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_timeout(Integer id) {
        return "PaymentHystrixService fallback paymentInfo_timeout,o(╥﹏╥)o";
    }
}
