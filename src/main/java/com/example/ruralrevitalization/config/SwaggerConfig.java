package com.example.ruralrevitalization.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    //配置Swagger2的Docket的定实例
    @Bean
    public Docket docket(){
        return  new Docket(DocumentationType.SWAGGER_2)
                // 如果关闭swagger服务
                // .enable(false)
                .apiInfo(apiInfo());
    }

    //配置Swagger信息 apiInfo类
    private ApiInfo apiInfo(){
        //作者信息
        Contact DEFAULT_CONTACT = new Contact("心心”乡“惜", "https://github.com/ysygMhdxw/RuralPro_Backend", "");

        return new ApiInfo("RuralPro API文档",
                "Api Documentation",
                "v1.0",
                "https://github.com/ysygMhdxw/RuralPro_Backend",
                DEFAULT_CONTACT,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList<>());
    }
}
//测试运行：http://localhost:9654/swagger-ui.html