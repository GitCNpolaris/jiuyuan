package com.jiuyuan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.jiuyuan.mapper")
@SpringBootApplication
public class JiuyuanBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(JiuyuanBookApplication.class, args);
    }

}
