package com.atguigu.gulimall.prodoct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProdoctApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProdoctApplication.class, args);
    }

}
