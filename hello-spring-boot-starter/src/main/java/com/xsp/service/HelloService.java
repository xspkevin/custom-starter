package com.xsp.service;

/**
 * @Description:
 * @Author: Xu Shengping
 * @Date: 2022/5/16 5:33 下午
 */
public class HelloService {
    private String name;
    private String address;

    public HelloService(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String sayHello() {
        return "大家好，我叫" + name + "，来自" + address + ", 很高兴认识大家！";
    }
}
