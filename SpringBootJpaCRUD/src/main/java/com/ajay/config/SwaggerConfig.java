package com.ajay.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static springfox.documentation.builders.PathSelectors.regex;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
	
	@Bean
public Docket smallApi()
{
	return new Docket(DocumentationType.SWAGGER_2)
			.select()
			.apis(RequestHandlerSelectors.basePackage("com.ajay"))
			.paths(regex("/.*"))
			.build()
			.apiInfo(metaInfo());

}
	private ApiInfo metaInfo()
	{
		ApiInfo apiInfo= new ApiInfo(
				"Marketing",
				"Marketing App with spring boot,thymeleaf,datajpa",
				"1.0",
				"Used for marketing purposes",
				new Contact("Ajay Dinakar","http://www.ajaydinakar.com","ajaydinakar6@gmail.com"),
				"Ajay Dinakar Licence",
				"http://www.ajaydinakar.com"
				);
		return apiInfo;
	}
}
