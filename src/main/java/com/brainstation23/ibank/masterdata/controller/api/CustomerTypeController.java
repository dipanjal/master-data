package com.brainstation23.ibank.masterdata.controller.api;

import com.brainstation23.ibank.masterdata.core.domain.BankResponse;
import com.brainstation23.ibank.masterdata.domain.CustomerTypeResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author dipanjal
 * @since 0.0.1
 */
@Tag(name = ApiTags.CUSTOMER_TYPE)
public interface CustomerTypeController {

    @GetMapping("/customer-type/all")
    @Operation(
            method = "GET",
            tags = ApiTags.CUSTOMER_TYPE,
            description = "Fetch all Active Customer Types",
            summary = "fetchAllActiveCustomerTypes")
    ResponseEntity<BankResponse<List<CustomerTypeResponse>>> fetchAllActiveCustomerTypes();

    @GetMapping("/customer-type/by-code/{code}")
    @Operation(
            method = "GET",
            tags = ApiTags.CUSTOMER_TYPE,
            description = "Fetch Active Customer Type by Code",
            summary = "fetchCustomerTypeByCode")
    ResponseEntity<BankResponse<CustomerTypeResponse>> fetchCustomerTypeByCode(@PathVariable String code);

}
