package com.goit.syrotskiy.module6.exceptionsMod;

public class DriverIsNotFastenedException extends CarException {
    public DriverIsNotFastenedException() {
        super();
    }

    public DriverIsNotFastenedException(String message, String errorCode) {
        super(message);
        setErrorCode(errorCode);
    }
}
