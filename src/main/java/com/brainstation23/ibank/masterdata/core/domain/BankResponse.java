package com.brainstation23.ibank.masterdata.core.domain;

import lombok.Builder;
import lombok.Getter;

/**
 * @author dipanjal
 * @since 0.0.1
 */

@Getter
@Builder(toBuilder = true)
public class BankResponse<T> {
    private int responseCode;
    private String responseMessage;
    private T data;
}
