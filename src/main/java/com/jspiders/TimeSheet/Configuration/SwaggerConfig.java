package com.jspiders.TimeSheet.Configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
@OpenAPIDefinition
public class SwaggerConfig {
	@Bean
	public OpenAPI baseApiDoc() {
		return new OpenAPI().info(new Info().title("Jsp_Timesheet").version("1.0.0").description("Employee Timesheet"));
	}
}
