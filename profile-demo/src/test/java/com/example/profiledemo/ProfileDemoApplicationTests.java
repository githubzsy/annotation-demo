package com.example.profiledemo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import javax.annotation.Resource;

@SpringBootTest
@Slf4j
class ProfileDemoApplicationTests {
    @Resource
    public Fruit fruit;

    @Test
    public void fruitTest() {
        Assert.isTrue(fruit.getName().equals("apple"), "不相等，当前环境为" + fruit.getName());
    }
}
