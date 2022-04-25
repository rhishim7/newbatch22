package com.zensar.stockapplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

	//Bean is now performed into spring container
	//@Configuration is used to add beans into spring container to perform
	
	@Bean
	public Docket getCustomizedDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
		.select()
		.apis(RequestHandlerSelectors.basePackage("com.zensar.stockapplication"))
		.build()
		.apiInfo(getApiInfo());
	}
	private ApiInfo getApiInfo() {
		
		return new ApiInfo("Stock Management Application", "All in one stock manager", "1.0.0x", "https://www.swagger.io","Rhishi", "Licensed to Zensar", "https://zensar.com");
	}
	
}
