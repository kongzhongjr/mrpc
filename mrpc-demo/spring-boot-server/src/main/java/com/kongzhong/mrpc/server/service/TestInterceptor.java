package com.kongzhong.mrpc.server.service;

import com.kongzhong.mrpc.interceptors.RpcServerInterceptor;
import com.kongzhong.mrpc.interceptors.ServerInvocation;
import lombok.extern.slf4j.Slf4j;

/**
 * @author biezhi
 *         2017/4/24
 */
@Slf4j
public class TestInterceptor implements RpcServerInterceptor {

    @Override
    public Object execute(ServerInvocation invocation) throws Exception {
        log.info("test interceptor execute before.");
        Object obj = invocation.next();
        log.info("test interceptor execute after.");
        return obj;
    }
}
