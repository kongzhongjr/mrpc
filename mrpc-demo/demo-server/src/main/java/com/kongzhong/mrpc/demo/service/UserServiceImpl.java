package com.kongzhong.mrpc.demo.service;

import com.kongzhong.mrpc.annotation.RpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

/**
 * @author biezhi
 * 2017/4/19
 */
@RpcService
public class UserServiceImpl implements UserService {

    @Autowired
    private PayService payService;

    @Override
    public String testTrace() {
        return payService.pay("asas", new BigDecimal("22"));
    }

}