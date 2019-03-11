/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pragma.crearcontratoswsdl.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 *
 * @author cesar.rodriguez
 */
@Configuration
@ComponentScan(basePackages = "com.pragma.crearcontratoswsdl")
@EnableWebMvc
public class ConfiguracionSpring extends WebMvcConfigurerAdapter{
    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver() {
        System.out.println("llega");
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
    return resolver;
 
    }
}
