package com.advancia.stage.jenkins_test_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class JenkinsTestDemoApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JenkinsTestDemoApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsTestDemoApplication.class, args);
	}
}