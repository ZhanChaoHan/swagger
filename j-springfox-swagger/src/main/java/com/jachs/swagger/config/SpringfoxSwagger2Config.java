package com.jachs.swagger.config;


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
public class SpringfoxSwagger2Config {
	@Value("${swagger2.enable}")
	private boolean enable;
	
	// 组织Docket对象，翻译过来就是摘要的意思，它是生成API文档的核心对象，里面配置一些必要的信息
	@Bean("用户模块")
	public Docket userDocket() {
		// 指定规范，这里是SWAGGER_2
		return new Docket(DocumentationType.SWAGGER_2).groupName("用户模块")
				// 设定Api文档头信息，这个信息会展示在文档UI的头部位置
				.apiInfo(swaggerDemoApiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.jachs.swagger.controller"))
				// 这里配合@ComponentScan一起使用，又再次细化了匹配规则(当然，我们也可以只选择@ComponentScan、paths()方法当中的一中)
				.paths(PathSelectors.regex("/user.*")).build();
	}

	@Bean("测试模块")
	public Docket testDocket() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("测试模块").select()
				.apis(RequestHandlerSelectors.basePackage("com.jachs.swagger.controller"))
				.paths(PathSelectors.regex("/test.*"))
				.build().apiInfo(swaggerDemoApiInfo()).enable(enable);
	}
	@Bean("群组模块")
	public Docket groupDocket() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("群组模块").select()
				.apis(RequestHandlerSelectors.basePackage("com.jachs.swagger.controller"))
				.paths(PathSelectors.regex("/group.*"))
				.build().apiInfo(swaggerDemoApiInfo()).enable(enable);
	}
	//自定义API文档基本信息实体
	private ApiInfo swaggerDemoApiInfo() {
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
