package com.example.profiledemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile(FruitKind.BANANA)
@Configuration
public class BananaConfig {

    @Bean
    public Fruit fruit(){
        Fruit e = new Fruit(FruitKind.BANANA);
        return e;
    }
}