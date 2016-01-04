package com.goit.syrotskiy.module6.exceptionsMod;

public class CarFueledNotWithPetrolException extends CarException {
    public CarFueledNotWithPetrolException() {
        super();
    }

    public CarFueledNotWithPetrolException(String message, String errorCode) {
        super(message);
        setErrorCode(errorCode);
    }
}
