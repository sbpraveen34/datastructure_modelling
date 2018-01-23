package com.praveen.dataStructure.exception;

public class InvalidNodeStateException extends Exception {
    public InvalidNodeStateException() {
    }

    public InvalidNodeStateException(String message) {
        super(message);
    }

    public InvalidNodeStateException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidNodeStateException(Throwable cause) {
        super(cause);
    }

}
