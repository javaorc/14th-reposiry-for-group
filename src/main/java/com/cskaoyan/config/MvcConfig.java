package com.cskaoyan.config;

import com.cskaoyan.converter.DateConverter;
import com.cskaoyan.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.PostConstruct;

@ComponentScan(basePackages = "com.cskaoyan.controller")
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {
    @Autowired
    ConfigurableConversionService conversionService;
    @PostConstruct
    public void addConverter(){
        conversionService.addConverter(new DateConverter());
    }
    @Bean
    @Primary
    public ConfigurableConversionService configurableConversionService(){
        return conversionService;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/hello/**");

    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //前面的是mapping 后面的是location
        registry.addResourceHandler("/pic/**").addResourceLocations("/WEB-INF/jpg/");
        registry.addResourceHandler("/pic2/**").addResourceLocations("classpath:/jpg/");
        registry.addResourceHandler("/pic3/**").addResourceLocations("file:e://jpg/");
    }
}
