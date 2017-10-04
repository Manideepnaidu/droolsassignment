package com.java.drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = SpringApplication.run(App.class, args);
    }

    @Bean
    public KieContainer kieContainer(){
        return KieServices.Factory.get().getKieClasspathContainer();
    }
}