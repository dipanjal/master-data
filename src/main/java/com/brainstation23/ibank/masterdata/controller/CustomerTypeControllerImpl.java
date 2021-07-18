package com.brainstation23.ibank.masterdata.controller;

import com.brainstation23.ibank.masterdata.controller.api.CustomerTypeController;
import com.brainstation23.ibank.masterdata.core.domain.BankResponse;
import com.brainstation23.ibank.masterdata.core.utils.ResponseBuilder;
import com.brainstation23.ibank.masterdata.domain.CustomerTypeResponse;
import com.brainstation23.ibank.masterdata.service.dictionary.api.CustomerTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author dipanjal
 * @since 0.0.1
 */

@RestController
@RequiredArgsConstructor
public class CustomerTypeControllerImpl implements CustomerTypeController {

    private final CustomerTypeService customerTypeService;

    @Override
    public ResponseEntity<BankResponse<List<CustomerTypeResponse>>> fetchAllActiveCustomerTypes() {

        return ResponseEntity.ok(
                ResponseBuilder.buildOkResponse(
                        customerTypeService.getActiveTypes()
                )
        );
    }

    @Override
    public ResponseEntity<BankResponse<CustomerTypeResponse>> fetchCustomerTypeByCode(@PathVariable String code) {

        return ResponseEntity.ok(
                ResponseBuilder.buildOkResponse(
                        customerTypeService.getActiveTypeByCode(code)
                )
        );
    }
}
