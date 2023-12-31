package com.github.marceloasfilho.decoderprojectapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DecoderProjectApigatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(DecoderProjectApigatewayApplication.class, args);
    }
}
