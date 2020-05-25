package com.example.profiledemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.Resource;

@SpringBootApplication
@Slf4j
public class ProfileDemoApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        log.debug("重新设置环境变量");
// 激活 like 的profile
        context.getEnvironment().setActiveProfiles(FruitKind.BANANA);
        context.register(BananaConfig.class, AppleConfig.class);
        context.refresh();
        Fruit env2 = (Fruit) context.getBean("fruit");
        log.debug(env2.toString());
    }

}
