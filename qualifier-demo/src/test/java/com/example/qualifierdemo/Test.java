package com.example.qualifierdemo;

import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @RunWith(SpringRunner.class) 表示下面测试在Spring容器下进行
 * Spring容器就是提供IOC中注入的对象，常见Service,Dao,还有自定义的@Bean
 * 不使用@RunWith(SpringRunner.class)注解，将无法自动注入这些对象，值为null
 */
@SpringBootTest
@Slf4j
@RunWith(SpringRunner.class)
public class Test {

    /**
     * 注释了的对象
     * 这些对象都会报错，因为有两种可注入的操作，这里不知道找哪一种
     * @Resource public MyBean myBean;
     * @Autowired public MyBean myBeanAutoWired;
     */

    /**
     * 通过@Resource name指定的注入
     * @Resource 是 javax 中的注解
     */
    @Resource(name = "MyBeanConfig")
    public MyBean myBeanWithMyBeanConfig;

    /**
     * @Autowired 是 spring 中的注解
     * 与@Qualifier联用可以指定哪一个注入的函数
     * 与@Resource(name="xx")相似
     */
    @Autowired
    @Qualifier("MyBeanConfig2")
    public MyBean myBeanAutoWiredWithMyBeanConfig2;

    @Resource
    public String stringBean;

    @org.junit.Test
    public void test() {
        //log.debug(myBean == null ? "@Resource" : "@Autowired:" + myBean.getName());
        log.debug("@Resource(name = \"MyBeanConfig\"):" + myBeanWithMyBeanConfig.getName());

        //log.debug(myBeanAutoWired == null ? "@AutoWired注入失败" : "@Autowired:" + myBeanAutoWired.getName());
        log.debug("@Autowired\n" +
                "    @Qualifier(\"MyBeanConfig2\") :\n" + myBeanAutoWiredWithMyBeanConfig2.getName());
    }

}
