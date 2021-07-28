package com.brainstation23.ibank.masterdata.service;

import com.brainstation23.ibank.masterdata.domain.CustomerTypeResponse;
import com.brainstation23.ibank.masterdata.service.dictionary.api.CustomerTypeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.LineSeparatorDetector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author dipanjal
 * @since 0.0.1
 */

@SpringBootTest
public class CustomerTypeServiceTest {

    @Autowired
    private CustomerTypeService customerTypeService;

    @Test
    void testAllCustomerTYpeService() {
        List<CustomerTypeResponse> list = customerTypeService.getActiveTypes();
        Assertions.assertNotNull(list);
    }

    @Test
    void testFetchCustomerTypeByCode() {
        String typeCode = "101";
        CustomerTypeResponse response = customerTypeService.getActiveTypeByCode(typeCode);
        Assertions.assertNotNull(response);
    }
}
