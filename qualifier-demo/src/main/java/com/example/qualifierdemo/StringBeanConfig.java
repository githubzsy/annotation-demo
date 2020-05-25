package com.example.qualifierdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StringBeanConfig {

    @Bean
    public String stringBean2(){
        return "string bean 2";
    }
}
