package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.app.AddCalculator;
import com.example.app.ArgumentResolver;
import com.example.app.Calculator;
import com.example.app.Frontend;
import com.example.app.ScannerArgumentResolver;

@Configuration // (1)
public class AppConfig {
    @Bean // (2)
    Calculator calculator() {
        return new AddCalculator(); // (3)
    }

    @Bean
    ArgumentResolver argumentResolver() {
        return new ScannerArgumentResolver();
    }

    @Bean
    Frontend frontend() {
        return new Frontend();
    }
}
