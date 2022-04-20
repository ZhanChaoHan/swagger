package com.jachs.swagger;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import lombok.extern.slf4j.Slf4j;

/****
 * @author zhanchaohan
 *
 */
@Slf4j
@SpringBootApplication
public class SwaggerApplication {

	public static void main(String[] args) throws UnknownHostException {
		ConfigurableApplicationContext application =SpringApplication.run(SwaggerApplication.class, args);
		Environment env = application.getEnvironment();
		String ip = InetAddress.getLocalHost().getHostAddress();
	    String port = env.getProperty("server.port");
	        
		log.info("\n----------------------------------------------------------\n\t" +
                "Swagger文档: \thttp://" + ip + ":" + port  + "/swagger-ui/index.html\n" +
                "----------------------------------------------------------");
	}
}

