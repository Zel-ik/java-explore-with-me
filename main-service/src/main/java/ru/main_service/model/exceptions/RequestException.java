package ru.main_service.model.exceptions;

public class RequestException extends RuntimeException {
    public RequestException(String message) {
        super(message);
    }
}
