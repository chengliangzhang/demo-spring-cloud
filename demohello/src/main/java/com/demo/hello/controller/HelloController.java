package com.demo.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    @Autowired
    private DiscoveryClient client;

    @Value("${eureka.instance.appname}")
    private String serviceName;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        List<ServiceInstance> instanceList = client.getInstances(serviceName);
        ServiceInstance instance = instanceList.get(0);
        return "hello:" + instance.getServiceId() + "-" + instance.getHost() + ":" + instance.getPort();
    }
}
