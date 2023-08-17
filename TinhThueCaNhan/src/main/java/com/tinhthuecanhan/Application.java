package com.tinhthuecanhan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.tinhthuecanhan.Application;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@ComponentScan("com.tinhthuecanhan")
public class Application {
	
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
