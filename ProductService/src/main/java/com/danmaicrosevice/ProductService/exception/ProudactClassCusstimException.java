package com.danmaicrosevice.ProductService.exception;

public class ProudactClassCusstimException extends RuntimeException{
    private String errorCode;

    public ProudactClassCusstimException(String message, Throwable cause, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}
