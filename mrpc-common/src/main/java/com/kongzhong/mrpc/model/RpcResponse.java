package com.kongzhong.mrpc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * RPC响应对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RpcResponse implements Serializable {

    private String requestId;
    private Object result;
    private Boolean success = false;
    private String returnType;

    private String exception;
    private String exceptionMeta;

}