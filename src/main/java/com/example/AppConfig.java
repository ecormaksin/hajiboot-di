package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.app.AddCalculator;
import com.example.app.Calculator;

@Configuration // (1)
public class AppConfig {
    @Bean // (2)
    Calculator calculator() {
        return new AddCalculator(); // (3)
    }
}
