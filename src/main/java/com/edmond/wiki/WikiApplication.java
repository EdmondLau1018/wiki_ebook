package com.edmond.wiki;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.edmond"})  //  扫描多个目录
@MapperScan("com.edmond.wiki.mapper")
public class WikiApplication {

    private static final Logger LOG = LoggerFactory.getLogger(WikiApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(WikiApplication.class, args);
        LOG.info("**********************项目启动成功**********************");
        LOG.info("当前项目运行在：http://127.0.0.1:8880 端口" );
        LOG.info("**********************项目启动成功**********************");

    }
}
