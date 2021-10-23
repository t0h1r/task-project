package com.example.demo.exceptions;

public class DocumentStorageException extends Throwable {
    public DocumentStorageException(String message) {
        super(message);
    }

    public DocumentStorageException(String message, Throwable cause) {
        super(message, cause);

    }
}
