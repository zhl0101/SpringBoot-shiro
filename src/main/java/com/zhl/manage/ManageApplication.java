package com.zhl.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ManageApplication {
    public static void main(String[] args) {
        SpringApplication app =new SpringApplication(ManageApplication.class);
        app.setAddCommandLineProperties(false);
        app.run(args);
    }
}
