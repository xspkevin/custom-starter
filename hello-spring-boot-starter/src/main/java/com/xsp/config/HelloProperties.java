package com.xsp.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Description: 读取配置文件转换为bean
 * @Author: Xu Shengping
 * @Date: 2022/5/16 5:26 下午
 */
@ConfigurationProperties(prefix = "hello")
@Data
public class HelloProperties {
    private String name;
    private String address;
}
