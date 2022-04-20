package com.jachs.springfox;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@Configuration
public class Swagger2Config {
	
	@Bean
	public Docket userDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.enable(true)
				.apiInfo(swaggerApiInfo())
                .select()
                //basePackage扫描哪个包
                .apis(RequestHandlerSelectors.basePackage("com.jachs.springfox.controller"))
                .paths(PathSelectors.any())
                .build();
	}

	//自定义API文档基本信息实体
	private ApiInfo swaggerApiInfo() {
		// 构建联系实体，在UI界面会显示
		Contact contact = new Contact("Jachs", "http://www.baidu.com", "799516423@qq.com");
		return new ApiInfoBuilder().contact(contact)
				// 文档标题
				.title("Swagger2构建RESTful API文档")
				// 文档描述
				.description("SpringBoot集成Springbox开源项目，实现OAS，构建成RESTful API文档")
				// 文档版本
				.version("1.0").build();
	}
}
