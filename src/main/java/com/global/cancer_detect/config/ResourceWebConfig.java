//package com.global.cancer_detect.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@EnableWebMvc
//@Configuration
//public class ResourceWebConfig implements WebMvcConfigurer {
//    final Environment environment;
//    @Value("${app.file.storage.mapping}")
//    private String myPropertyValue;
//    public ResourceWebConfig(Environment environment) {
//        this.environment = environment;
//    }
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/uploads/**")
//                .addResourceLocations("file:" + System.getProperty("user.dir") + "/uploads/");
//    }
////    ----------------------------------------------------------------------------------------------------------------
//
//}