package com.demo.caller.controller;

import com.demo.caller.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 深圳市卯丁技术有限公司
 * 日期: 2018/9/29
 * 类名: com.demo.caller.controller.FeignCallerController
 * 作者: 张成亮
 * 描述:
 **/
@RestController
public class FeignCallerController {
    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/caller", method = RequestMethod.GET)
    public String caller(){
        return helloService.hello();
    }

}
