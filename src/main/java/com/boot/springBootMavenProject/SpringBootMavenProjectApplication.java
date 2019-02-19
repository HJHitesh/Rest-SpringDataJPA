package com.boot.springBootMavenProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages="com.boot.springBootMavenProject")
@EnableJpaRepositories(basePackages = "com.boot.springBootMavenProject.repository")
@EnableAutoConfiguration
public class SpringBootMavenProjectApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMavenProjectApplication.class, args);
	}

}

