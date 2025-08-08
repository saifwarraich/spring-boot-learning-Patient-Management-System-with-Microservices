package com.pm.patient_service.exception;

import java.util.UUID;

public class UserDoesNotExistException extends RuntimeException {
private static final long serialVersionUID = 1L;

    public UserDoesNotExistException(UUID id) {
        super("Patient with ID " + id + " does not exist.");
    }
}
