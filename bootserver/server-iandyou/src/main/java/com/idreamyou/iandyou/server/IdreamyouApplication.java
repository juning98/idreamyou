package com.idreamyou.iandyou.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 程序启动类
 *
 * @author Juning
 * @date 2018/12/18
 */
@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = {"com.idreamyou.iandyou.api","com.idreamyou.iandyou.server"})
public class IdreamyouApplication {

    public static void main(String[] args) {
        SpringApplication.run(IdreamyouApplication.class, args);
    }

}

