package com.jachs.springfox;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication
@MapperScan("com.jachs.springfox.mapper")
@ServletComponentScan("com.jachs.springfox.service")
public class SpringFoxApplication {
	///http://ip:port/swagger-ui/index.html
	public static void main(String[] args) {
		SpringApplication.run(SpringFoxApplication.class, args);
	}

}
