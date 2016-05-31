package com.codependent.sample;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class UserApiApplication {

    public static void main(String[] args) {
    	new SpringApplicationBuilder(UserApiApplication.class).web(true).run(args);
    }
    
}
