package com.example.qualifierdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeanConfig {

    @Bean(name="MyBeanConfig")
    public MyBean myBean(){
        return new MyBean("MyBeanConfig所获得的对象");
    }

}
