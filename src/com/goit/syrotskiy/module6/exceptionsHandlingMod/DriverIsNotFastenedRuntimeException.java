package com.goit.syrotskiy.module6.exceptionsHandlingMod;

public class DriverIsNotFastenedRuntimeException extends CarRuntimeException {
    public DriverIsNotFastenedRuntimeException() {
        super();
    }

    public DriverIsNotFastenedRuntimeException(String message, String errorCode) {
        super(message);
        setErrorCode(errorCode);
    }
}
