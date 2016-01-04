package com.goit.syrotskiy.module6.exceptionsHandlingMod;

public class CarRuntimeException extends RuntimeException {
    private String errorCode = "Unknown_Exception";

    public CarRuntimeException() {
    }

    public CarRuntimeException(String message) {
        super(message);
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
