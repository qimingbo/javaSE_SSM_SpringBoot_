package com.qmb.a02exceptiontest;

public class AgeFormatException extends RuntimeException {
    public AgeFormatException() {
    }

    public AgeFormatException(String message) {
        super(message);
    }
}
