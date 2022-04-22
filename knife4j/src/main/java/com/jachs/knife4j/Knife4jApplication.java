package com.jachs.knife4j;

import java.net.InetAddress;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@MapperScan("com.jachs.knife4j.mapper")
@ServletComponentScan("com.jachs.knife4j.service")
@SpringBootApplication
public class Knife4jApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication app=new SpringApplication(Knife4jApplication.class);
		ConfigurableApplicationContext application=app.run(args);
		Environment env = application.getEnvironment();
		log.info("\n----------------------------------------------------------\n\t" +
						"Application '{}' is running! Access URLs:\n\t" +
						"Local: \t\thttp://localhost:{}\n\t" +
						"External: \thttp://{}:{}\n\t"+
						"Doc: \thttp://{}:{}/doc.html\n"+
						"----------------------------------------------------------",
				env.getProperty("spring.application.name"),
				env.getProperty("server.port"),
				InetAddress.getLocalHost().getHostAddress(),
				env.getProperty("server.port"),
				InetAddress.getLocalHost().getHostAddress(),
				env.getProperty("server.port"));
	}

}
