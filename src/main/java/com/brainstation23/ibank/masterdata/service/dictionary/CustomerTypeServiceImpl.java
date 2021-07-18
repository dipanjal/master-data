package com.brainstation23.ibank.masterdata.service.dictionary;

import com.brainstation23.ibank.masterdata.core.exception.RecordNotFoundException;
import com.brainstation23.ibank.masterdata.domain.CustomerTypeResponse;
import com.brainstation23.ibank.masterdata.service.dictionary.api.CustomerTypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dipanjal
 * @since 0.0.1
 */
@Slf4j
@Service
public class CustomerTypeServiceImpl implements CustomerTypeService {

    @Override
    public List<CustomerTypeResponse> getActiveTypes() {

        return List.of(
                CustomerTypeResponse.builder().code("100").value("Regular").build(),
                CustomerTypeResponse.builder().code("101").value("Lookers").build(),
                CustomerTypeResponse.builder().code("102").value("Bargain Hunters").build(),
                CustomerTypeResponse.builder().code("103").value("Buyers").build(),
                CustomerTypeResponse.builder().code("104").value("Researchers").build(),
                CustomerTypeResponse.builder().code("105").value("Legacy").build());
    }

    @Override
    public CustomerTypeResponse getActiveTypeByCode(final String code) {

        return getActiveTypes()
                .stream()
                .filter(item -> item.getCode().equals(code))
                .findAny()
                .orElseThrow(RecordNotFoundException::new);
    }
}
