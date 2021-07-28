package com.brainstation23.ibank.masterdata.core.utils;

import com.brainstation23.ibank.masterdata.core.domain.BankResponse;
import lombok.experimental.UtilityClass;
import org.springframework.http.HttpStatus;

/**
 * @author dipanjal
 * @since 0.0.1
 */

@UtilityClass
public class ResponseBuilder {

    public <T> BankResponse<T> buildResponse(T item, HttpStatus status, String message){

        return BankResponse.<T>builder()
                .responseCode(status.value())
                .responseMessage(message)
                .data(item)
                .build();
    }

    public <T> BankResponse<T> buildResponse(T item, HttpStatus status){
        return buildResponse(item, status, status.getReasonPhrase());
    }

    public BankResponse<Void> buildResponse(HttpStatus status){
        return buildResponse(null, status);
    }

    public BankResponse<Void> buildResponse(HttpStatus status, String message){
        return buildResponse(null, status, message);
    }

    public <T> BankResponse<T> buildOkResponse(T item, String message){
        return buildResponse(item, HttpStatus.OK, message);
    }

    public <T> BankResponse<T> buildOkResponse(T item){
        return buildResponse(item, HttpStatus.OK);
    }

    public BankResponse<Void> buildOkResponse(){
        return buildResponse(HttpStatus.OK);
    }

}
