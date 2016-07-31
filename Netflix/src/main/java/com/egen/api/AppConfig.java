package com.egen.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan
@EnableWebMvc
public class AppConfig {
	
	
	@Bean
	public ViewResolver viewResolver()
	{
		InternalResourceViewResolver iv= new InternalResourceViewResolver();
		iv.setViewClass(JstlView.class);
		iv.setPrefix("/");
		iv.setSuffix(".jsp");
		return iv;
	}
}
