package com.brainstation23.ibank.masterdata.controller.advice;

import com.brainstation23.ibank.masterdata.core.domain.BankResponse;
import com.brainstation23.ibank.masterdata.core.exception.RecordNotFoundException;
import com.brainstation23.ibank.masterdata.core.utils.ResponseBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Collections;

/**
 * @author dipanjal
 * @since 0.0.1
 */

@Slf4j
@ControllerAdvice
public class MasterDataExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(RecordNotFoundException.class)
    public ResponseEntity<?> recordNotFoundExHandler(RecordNotFoundException ex, WebRequest request) {
        HttpStatus status = HttpStatus.NOT_FOUND;

        return ResponseEntity
                .status(status)
                .body(ResponseBuilder
                        .buildResponse(status, ex.getMessage()));
    }
}
