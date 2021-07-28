package com.brainstation23.ibank.masterdata.core.exception;

/**
 * @author dipanjal
 * @since 0.0.1
 */
public class RecordNotFoundException extends RuntimeException {

    public RecordNotFoundException() {
        super("Record not found");
    }

    public RecordNotFoundException(String message) {
        super(message);
    }

    public RecordNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
