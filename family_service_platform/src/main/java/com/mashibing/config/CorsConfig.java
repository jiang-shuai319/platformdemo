package com.mashibing.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {
    private CorsConfiguration buildConfig(){
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        // 允许跨域请求的地址，“*”所有
        corsConfiguration.addAllowedOrigin("*");
        // 跨域的请求头
        corsConfiguration.addAllowedHeader("*");
        // 跨域的请求方法
        corsConfiguration.addAllowedMethod("*");
        // 在跨域请求的时候使用同一个Session
        corsConfiguration.setAllowCredentials(true);
        return corsConfiguration;
    }
    @Bean
    public CorsFilter corsFilter(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        // 配置可以访问的地址
        source.registerCorsConfiguration("/**",buildConfig());
        return new CorsFilter(source);
    }
}
