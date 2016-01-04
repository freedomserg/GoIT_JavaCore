package com.goit.syrotskiy.module6.exceptionsHandlingMod;

public class CarException extends Exception {
    private String errorCode = "Unknown_Exception";

    public CarException() {
    }

    public CarException(String message) {
        super(message);
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
