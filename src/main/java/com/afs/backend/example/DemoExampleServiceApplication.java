package com.afs.backend.example;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication(scanBasePackages = {"com.afs.backend.example", "com.afs.backend.base"})
@EnableFeignClients
@OpenAPIDefinition(info = @Info(title = "EXAMPLE API", version = "1.0"),
        servers = {@Server(url = "/", description = "Default Server URL")})
public class DemoExampleServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoExampleServiceApplication.class, args);
    }

}
