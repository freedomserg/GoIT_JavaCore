package com.goit.syrotskiy.module6.exceptionsMod;

public class DriverIsNotFastenedRuntimeException extends CarRuntimeException {
    public DriverIsNotFastenedRuntimeException() {
        super();
    }

    public DriverIsNotFastenedRuntimeException(String message, String errorCode) {
        super(message);
        setErrorCode(errorCode);
    }
}
