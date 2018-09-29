package com.demo.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 深圳市卯丁技术有限公司
 * 日期: 2018/9/27
 * 类名: com.demo.application.controller.Application
 * 作者: 张成亮
 * 描述:
 **/
@EnableEurekaServer
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
