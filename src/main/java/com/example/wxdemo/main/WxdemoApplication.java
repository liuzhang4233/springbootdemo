package com.example.wxdemo.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan(basePackages = {"com.wxdemo"})
@MapperScan(basePackages = "com.wxdemo.mapper")
@EnableScheduling
public class WxdemoApplication {

    public static void main(String[] args) {
//        ConfigurableApplicationContext context = new SpringApplicationBuilder(WxdemoApplication.class).web(WebApplicationType.NONE).run(args);
//        ConfigurableEnvironment environment = context.getEnvironment();
//        System.out.println("测试扩展外部配置结果out：" + environment.getProperty("test"));
//        System.err.println("测试扩展外部配置结果error：" + environment.getProperty("test"));
//        environment.getPropertySources().forEach(propertySource -> {
//            System.err.printf("PropertySource[名称:%s]  :  %s\n",propertySource.getName(),propertySource);
//            System.out.println();
//        });
        SpringApplication.run(WxdemoApplication.class, args);
//        context.close();
    }
}

