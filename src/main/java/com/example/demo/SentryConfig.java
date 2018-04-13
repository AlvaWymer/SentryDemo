package com.example.demo;

import io.sentry.Sentry;
import io.sentry.spring.SentryExceptionResolver;
import io.sentry.spring.SentryServletContextInitializer;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.HandlerExceptionResolver;

import javax.annotation.PostConstruct;

/**
 * Author: Yang Naihua<br>
 * Description:com.example.demo <br>
 * Date: Create in 15:15 2018/4/13<br>
 * Modified By:
 */
// 可以调用生产环境
//@ActiveProfiles("prod")
@Configuration
public class SentryConfig {
    @Bean
    public HandlerExceptionResolver sentryExceptionResolver() {
        return new SentryExceptionResolver();
    }

    @Bean
    public ServletContextInitializer sentryServletContextInitializer() {
        return new SentryServletContextInitializer();
    }

    @PostConstruct
    public void init(){
        Sentry.init("https://7b0e8c769a644370a9cbe37b3d3b8087:823d7024a62247f8a73b6a3b1136e926@sentry.io/1188623");
    }
}
