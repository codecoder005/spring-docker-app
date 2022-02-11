package com.dmi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringDockerAppApplication {
	@Autowired
	private Environment environment;
	private final static Logger LOGGER = LoggerFactory.getLogger(SpringDockerAppApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringDockerAppApplication.class, args);
	}
	@PostConstruct
	public void postConstruct(){
		LOGGER.info("PostConstruct");
		LOGGER.info("App is running on port: "+environment.getProperty("local.server.port"));
	}
}
