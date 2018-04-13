package com.example.demo;

import io.sentry.Sentry;
import io.sentry.spring.SentryExceptionResolver;
import io.sentry.spring.SentryServletContextInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HandlerExceptionResolver;

@SpringBootApplication
public class DemoApplication {

    /*
   Register a HandlerExceptionResolver that sends all exceptions to Sentry
   and then defers all handling to the other HandlerExceptionResolvers.

   You should only register this is you are not using a logging integration,
   otherwise you may double report exceptions.
    */
//    @Bean
//    public HandlerExceptionResolver sentryExceptionResolver() {
//        return new io.sentry.spring.SentryExceptionResolver();
//    }


	/*
    Register a ServletContextInitializer that installs the SentryServletRequestListener
    so that Sentry events contain HTTP request information.

    This should only be necessary in Spring Boot applications. "Classic" Spring
    should automatically load the `io.sentry.servlet.SentryServletContainerInitializer`.
     */

//    @Bean
//    public ServletContextInitializer sentryServletContextInitializer() {
//        return new io.sentry.spring.SentryServletContextInitializer();
//    }


    /**参考文档1----->   https://docs.sentry.io/clients/java/config/#in-application-stack-frames
     * 参考文档2----->    https://sentry.io/ftlexpress/java-n0/settings/install/
     *
     * Setting the DSN (Data Source Name)¶
     *
     * The DSN is the first and most important thing to configure because it tells the SDK where to send events. You can find your project’s DSN in the “Client Keys” section of your “Project Settings” in Sentry. It can be configured in multiple ways. Explanations of the configuration methods are detailed below.
     *
     * In a properties file on your filesystem or classpath (defaults to sentry.properties):
     *
     * dsn=https://public:private@host:port/1
     * Via the Java System Properties:
     *
     * java -Dsentry.dsn=https://public:private@host:port/1 -jar app.jar
     * Via a System Environment Variable:
     *
     * SENTRY_DSN=https://public:private@host:port/1 java -jar app.jar
     * In code:
     *
     * import io.sentry.Sentry;
     *
     * Sentry.init("https://public:private@host:port/1");
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
//		Sentry.init("https://7b0e8c769a644370a9cbe37b3d3b8087:823d7024a62247f8a73b6a3b1136e926@sentry.io/1188623");
    }
}
