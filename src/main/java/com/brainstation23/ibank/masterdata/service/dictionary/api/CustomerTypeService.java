package com.brainstation23.ibank.masterdata.service.dictionary.api;

import com.brainstation23.ibank.masterdata.domain.CustomerTypeResponse;

import java.util.List;

/**
 * @author dipanjal
 * @since 0.0.1
 */
public interface CustomerTypeService {

    List<CustomerTypeResponse> getActiveTypes();
    CustomerTypeResponse getActiveTypeByCode(String code);
}
