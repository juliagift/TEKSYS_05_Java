package com.example.springsecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	protected void configure(HttpSecurity http) throws Exception {
		http
				.authorizeRequests()
					.antMatchers("/","/home").permitAll()      //all users that log into site is permitted to the home page
					.anyRequest().authenticated()             //any other request, users need to be authenticated
					.and()
				.formLogin()                    
					.loginPage("/login")
					.permitAll()           //permit all to the login page
					.and()
				.logout()
					.permitAll();   //if users are authenticated, then can log out
				
	}
	
	@Bean
	@Override
	public UserDetailsService userDetailsService() {
		UserDetails user = User.withDefaultPasswordEncoder()
								.username("user")
								.password("password")
								.roles("USER")
								.build();
		
		return new InMemoryUserDetailsManager(user);
	}
	
}
