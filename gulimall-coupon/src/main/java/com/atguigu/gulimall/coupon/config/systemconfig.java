package com.atguigu.gulimall.coupon.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ZhangYM
 * @create 2022-04-24 0:06
 */
@Data
@Component
@ConfigurationProperties(prefix="systemconfig")
public class systemconfig {

    private String name;
}
