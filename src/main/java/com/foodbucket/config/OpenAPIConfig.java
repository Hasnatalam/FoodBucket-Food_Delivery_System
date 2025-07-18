package com.foodbucket.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("FoodBucket API")
                .version("1.0")
                .description("API documentation for FoodBucket - Online Food Ordering and Delivery System")
                .contact(new Contact()
                    .name("Hasnat Alam")
                    .email("hasnatalamofficial@gmail.com")
                    //.url("https://www.foodbucket.com")
                    ) 
                .license(new License()
                    .name("Apache 2.0")
                    .url("https://www.apache.org/licenses/LICENSE-2.0")));
    }
}
