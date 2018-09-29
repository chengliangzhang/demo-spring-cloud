package com.demo.caller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 深圳市卯丁技术有限公司
 * 日期: 2018/9/29
 * 类名: com.demo.caller.controller.CallerController
 * 作者: 张成亮
 * 描述:
 **/
@RestController
public class CallerController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/caller", method = RequestMethod.GET)
    public String caller(){
        return restTemplate.getForEntity("http://hello-service/hello",String.class)
                .getBody();
    }

}
