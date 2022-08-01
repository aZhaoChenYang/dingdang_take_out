package com.dudu;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ServletComponentScan
@EnableTransactionManagement // 开启事务支持
@EnableCaching //开启Spring Cache注解方式是缓存功能
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class);
    }
}
