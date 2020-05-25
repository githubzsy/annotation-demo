package com.example.qualifierdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeanConfig2 {

    @Bean(name="MyBeanConfig2")
    public MyBean myBean(){
        return new MyBean("MyBeanConfig2所获得的a");
    }

}
