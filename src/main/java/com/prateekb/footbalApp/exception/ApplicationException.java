package com.prateekb.footbalApp.exception;

import lombok.Data;

@Data
public class ApplicationException extends RuntimeException {
    private String errorCode;
    private int status;

    public ApplicationException(String message,String errorCode,Integer status){
        super(message);
        this.errorCode = errorCode;
        this.status = status;
    }
}
