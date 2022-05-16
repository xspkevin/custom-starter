package com.xsp.controller;

import com.xsp.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: Xu Shengping
 * @Date: 2022/5/16 5:45 下午
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    // HelloService在我们自定义的starter中已经完成了自动配置，所以此处可以直接注入
    @Autowired
    private HelloService helloService;

    @GetMapping("/say")
    public String sayHello() {
        return helloService.sayHello();
    }
}
