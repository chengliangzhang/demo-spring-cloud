package com.demo.hello.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 深圳市卯丁技术有限公司
 * 日期: 2018/9/28
 * 类名: com.demo.hello.controller.HelloController
 * 作者: 张成亮
 * 描述:
 **/
@RestController
@Configuration
public class HelloController {
    @Value("${eureka.instance.appname}")
    private String serviceName;

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "hello:" + serviceName + ":" + port;
    }
}
