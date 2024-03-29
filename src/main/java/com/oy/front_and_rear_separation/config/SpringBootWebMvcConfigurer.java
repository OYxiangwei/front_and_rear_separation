package com.oy.front_and_rear_separation.config;

import com.oy.front_and_rear_separation.common.Constants;
import com.oy.front_and_rear_separation.config.handler.TokenToUserMethodArgumentResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class SpringBootWebMvcConfigurer implements WebMvcConfigurer {
    @Autowired
    private TokenToUserMethodArgumentResolver tokenUserMethodArgumentResolver;

    /**
     * TokenToUser 注解处理方法
     *
     * @param argumentResolvers
     */
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(tokenUserMethodArgumentResolver);
    }
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/files/**").addResourceLocations("file:"+ Constants.FILE_UPLOAD_PATH);
    }
}
