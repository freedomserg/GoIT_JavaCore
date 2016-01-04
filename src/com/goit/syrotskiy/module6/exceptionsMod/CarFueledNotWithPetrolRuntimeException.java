package com.goit.syrotskiy.module6.exceptionsMod;

public class CarFueledNotWithPetrolRuntimeException extends CarRuntimeException {
    public CarFueledNotWithPetrolRuntimeException() {
        super();
    }

    public CarFueledNotWithPetrolRuntimeException(String message, String errorCode) {
        super(message);
        setErrorCode(errorCode);
    }
}
