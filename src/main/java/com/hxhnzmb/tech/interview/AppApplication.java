package com.hxhnzmb.tech.interview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * @author yaoli
 * @date 2020/3/31 11:26
 */
@SpringBootApplication(scanBasePackages = {"com.hxhnzmb.tech.interview"})
@Configuration
public class AppApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(AppApplication.class);
        // ... customize application settings here
        application.run(args);
    }
}
