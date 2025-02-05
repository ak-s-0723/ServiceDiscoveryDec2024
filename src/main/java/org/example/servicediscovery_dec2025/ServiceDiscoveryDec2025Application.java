package org.example.servicediscovery_dec2025;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryDec2025Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscoveryDec2025Application.class, args);
    }

}
