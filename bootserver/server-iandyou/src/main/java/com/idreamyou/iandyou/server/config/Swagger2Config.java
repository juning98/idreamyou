package com.idreamyou.iandyou.server.config;

import com.iandyou.common.util.common.swaggerUtils.Swagger2Util;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.RequestHandlerSelectors.basePackage;

/**
 * Swagger API文档配置
 *
 * @author yin
 * @date 2018/12/18
 */
@Configuration
@EnableSwagger2
public class Swagger2Config extends Swagger2Util {

    /**
     * 创建API应用
     * api() 增加API相关信息
     * 通过select()函数返回一个ApiSelectorBuilder实例,用来控制哪些接口暴露给Swagger来展现，
     * 本例采用指定扫描的包路径来定义指定要建立API的目录。
     *
     * @return
     */
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("后端接口api文档")
                .apiInfo(apiInfo())
                .genericModelSubstitutes(DeferredResult.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(false)
                .select()
//                .apis(basePackage("com.idreamyou.iandyou.server.controller" + splitor + "com.idreamyou.iandyou.api.login"))
                .apis(basePackage("com.idreamyou.iandyou.api"))
                .paths(PathSelectors.any())
                .build();
    }

    //构建 api文档的详细信息函数,注意这里的注解引用的是哪个
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("idreamyou-IM")
                .version("1.0")
                .build();
    }
}
