package com.brainstation23.ibank.masterdata.core.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author dipanjal
 * @since 2/13/2021
 */
@Configuration
@RequiredArgsConstructor
public class OpenApiConfiguration {

    private final String SECURITY_SCHEME_NAME = "BearerAuth";

    @Bean
    public OpenAPI customOpenAPI(@Value("${api.version}") final String apiVersion) {
        return new OpenAPI()
                .addSecurityItem(new SecurityRequirement().addList(SECURITY_SCHEME_NAME))
                .components(getSecurityComponents())
                .info(getApiInfo(apiVersion));
    }

    private Components getSecurityComponents() {
        return new Components()
                .addSecuritySchemes(SECURITY_SCHEME_NAME, new SecurityScheme()
                                .type(SecurityScheme.Type.HTTP)
                                .scheme("bearer")
                                .bearerFormat("JWT"));
    }

    private Info getApiInfo(final String apiVersion){
        return new Info()
                .title("Master Data API")
                .version(apiVersion)
                .description("A RESTful API Service for Cardinity Project Management Application")
                .contact(getContactInfo())
                .termsOfService("http://swagger.io/terms/")
                .license(new License().name("Apache 2.0").url("http://springdoc.org"));
    }

    private Contact getContactInfo(){
        return new Contact()
                .name("Brain Station 23")
                .url("https://brainstation-23.com/");
    }
}
