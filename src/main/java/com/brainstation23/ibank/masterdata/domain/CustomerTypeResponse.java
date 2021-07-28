package com.brainstation23.ibank.masterdata.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

/**
 * @author dipanjal
 * @since 0.0.1
 */


@Getter
@Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerTypeResponse {
    private final String code;
    private final String value;
}
