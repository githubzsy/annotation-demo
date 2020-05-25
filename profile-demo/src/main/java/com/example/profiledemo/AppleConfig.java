package com.example.profiledemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile(FruitKind.APPLE)
@Configuration
public class AppleConfig {

    @Bean
    public Fruit fruit(){
        Fruit e = new Fruit(FruitKind.APPLE);
        return e;
    }

}