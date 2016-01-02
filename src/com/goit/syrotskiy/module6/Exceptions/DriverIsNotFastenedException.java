package com.goit.syrotskiy.module6.Exceptions;

public class DriverIsNotFastenedException extends CarException {
    public DriverIsNotFastenedException() {
        super();
    }

    public DriverIsNotFastenedException(String message, String errorCode) {
        super(message);
        setErrorCode(errorCode);
    }
}
