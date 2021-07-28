package com.brainstation23.ibank.masterdata.property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author dipanjal
 * @since 0.0.1
 */

@Component
@ConfigurationProperties("spring")
@Getter
@Setter
public class ApplicationData {

    private Profiles profiles;
    private Application application;


    @Getter
    @Setter
    public static class Application {
        private String name;
    }

    @Getter
    @Setter
    public static class Profiles {
        private String active;
    }
}
