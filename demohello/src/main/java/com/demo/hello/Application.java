package com.demo.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 深圳市卯丁技术有限公司
 * 日期: 2018/9/28
 * 类名: com.demo.hello.Hello
 * 作者: 张成亮
 * 描述:
 **/
@SpringBootApplication
public class Application extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
