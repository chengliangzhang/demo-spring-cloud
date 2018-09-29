package com.demo.caller;

import com.demo.random.MyApplicationEnvironmentPreparedEventListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 深圳市卯丁技术有限公司
 * 日期: 2018/9/29
 * 类名: com.demo.caller.Application
 * 作者: 张成亮
 * 描述:
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Application {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.addListeners(new MyApplicationEnvironmentPreparedEventListener());
        app.run(args);
    }

    @Bean
    @LoadBalanced //可开启负载均衡检测
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
