package com.springboot.learn.Day_12_01_mapstruct.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Swagger {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                .title("Learn MapStruct")
                .description("Learn map struct for mapping dtos and models.")
                .version("1.0"));
    }
}
