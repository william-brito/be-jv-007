package com.letscode.letsmail.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("LetsMail Service")
                        .description("LetsMail - Disparo de campanhas de marketing por e-mails.")
                        .version("v1.0.0"));
    }

}