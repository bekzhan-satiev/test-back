package com.example.demo;

import kg.gov.ukuk.requestlogger.service.RequestLoggerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
        // Start Spring Boot and get the context
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        // Try to get the RequestLoggerService bean
        if (context.containsBean("requestLoggerService")) {
            RequestLoggerService loggerService = context.getBean(RequestLoggerService.class);
            System.out.println("RequestLoggerService bean found: " + loggerService);

        } else {
            System.out.println("RequestLoggerService bean NOT found!");
        }

	}

}
