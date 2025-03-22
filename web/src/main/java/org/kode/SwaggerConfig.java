package org.kode;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi adminApi() {
        return GroupedOpenApi.builder()
                .group("admin")
                .pathsToMatch("/api/admin/**")
                .packagesToScan("org.kode.web.admin").build();
    }

    @Bean
    public GroupedOpenApi appApi() {
        return GroupedOpenApi.builder()
                .group("app")
                .pathsToMatch("/api/app/**")
                .packagesToScan("org.kode.web.app").build();
    }

    @Bean
    public OpenAPI openApi() {
        Contact contact = new Contact();
        contact.setName("koder");

        return new OpenAPI().info(new Info()
                .title("Kode API")
                .description("Kode API")
                .contact(contact)
        );
    }
}
