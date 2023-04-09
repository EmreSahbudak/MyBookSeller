package com.emre.exception;

import lombok.Getter;

@Getter
public class MyBooksException extends RuntimeException {

    private final ErrorType errorType;

    public MyBooksException(ErrorType errorType) {
        super(errorType.getMessage());
        this.errorType=errorType;
    }
    //overriredi
    public MyBooksException(ErrorType errorType, String message) {
        super(message);
        this.errorType=errorType;
    }
}
