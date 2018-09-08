package com.perfios.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig extends WebMvcConfigurerAdapter {
    /**
     * Provide bean for Swagger
     *
     * @return Docket
     */
    @Bean
    public Docket getDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(buildApiInfo())
                .useDefaultResponseMessages(false)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.perfios.resource"))
                .paths(PathSelectors.regex("/api/v1/.*"))
                .build();
    }

    /**
     * Build API info for Swagger
     *
     * @return ApiInfo
     */
    private ApiInfo buildApiInfo() {
        return new ApiInfoBuilder()
                .title("Mandi Service")
                .description("This is swagger page for the Mandi Rest service")
                .version("v1")
                .build();
    }
}
