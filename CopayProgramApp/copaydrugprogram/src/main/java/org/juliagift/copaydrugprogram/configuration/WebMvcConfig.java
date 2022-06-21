package org.juliagift.copaydrugprogram.configuration;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.method.annotation.AuthenticationPrincipalArgumentResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
//extends WebMvcConfigurationSupport 
public class WebMvcConfig {
	
//	 @Override
//	    public void addViewControllers(ViewControllerRegistry registry) {
//	     
//	        registry.addViewController("/home").setViewName("home");
//	        registry.addViewController("/registration").setViewName("registration");
//	        registry.addViewController("/index").setViewName("index");
//	        registry.addViewController("/adminDashboard").setViewName("adminDashboard");
//	         
//	    }
	
//	@Override
//	protected void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
//	   argumentResolvers.add(new AuthenticationPrincipalArgumentResolver());
//	}
}
