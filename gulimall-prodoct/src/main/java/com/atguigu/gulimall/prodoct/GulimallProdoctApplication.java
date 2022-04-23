package com.atguigu.gulimall.prodoct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallProdoctApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProdoctApplication.class, args);
    }

}
