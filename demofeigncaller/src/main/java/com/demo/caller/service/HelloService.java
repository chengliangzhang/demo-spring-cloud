package com.demo.caller.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 深圳市卯丁技术有限公司
 * 日期: 2018/9/29
 * 类名: com.demo.caller.controller.FeignCallerController
 * 作者: 张成亮
 * 描述:
 **/
@FeignClient("hello-service")
public interface HelloService {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello();
}
