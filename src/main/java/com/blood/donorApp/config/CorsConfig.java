package com.blood.donorApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class CorsConfig 
{

    @Bean
    public WebMvcConfigurer corsConfigurer() 
    {
        return new WebMvcConfigurer() 
        {
            @Override
            public void addCorsMappings(CorsRegistry registry) 
            {
                registry.addMapping("/**")
                        .allowedOrigins("https://blood-bridge-neon.vercel.app") // change later to frontend URL
                        .allowedMethods("*")
                        .allowedHeaders("*");
            }
        };
    }
}
