package com.demo.mongodbexporter;

import io.camunda.zeebe.spring.client.EnableZeebeClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableZeebeClient
//@Deployment(resources = "classpath:demoProcess.bpmn")
public class MongodbExporterApplication {
    public static void main(String[] args) {
        SpringApplication.run(MongodbExporterApplication.class, args);
    }

}
