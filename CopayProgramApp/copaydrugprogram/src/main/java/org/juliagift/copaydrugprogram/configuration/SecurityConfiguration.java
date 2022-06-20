package org.juliagift.copaydrugprogram.configuration;

import org.juliagift.copaydrugprogram.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserService userService;
	
	@Autowired
	private LoginSuccessHandler loginSuccessHandler;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
//				.authorizeRequests()
//					.antMatchers(
//								"/js/**", 
//								"/css/**", 
//								"/img/**", 
//								"/webjars/**")
//							.permitAll()
//				
//					.antMatchers("/home/**").access("hasRole('USER') or hasRole('ADMIN')")
//					.antMatchers("/registration/**").access("hasRole('USER')")
//					.antMatchers("/index/**").access("hasRole('USER')")
//					.antMatchers("/adminDashboard/**").access("hasRole('ADMIN')")
//					
//						.anyRequest().authenticated()
//						
//						
//						
//					.and()
//						.formLogin()
//							.loginPage("/login")
//								.successHandler(successHandler)
//								.failureUrl("/login?error")
//									.permitAll()
//					.and()
//						.logout()
//							.invalidateHttpSession(true)
//							.clearAuthentication(true)
//							.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//							.logoutSuccessUrl("/login?logout")
//									.permitAll()
//					;		
							
				.authorizeRequests()
					.antMatchers(			
							"/home**", 
							"/registration**", 
//							"/index**",
							"/js/**", 
							"/css/**", 
							"/img/**", 
							"/webjars/**").permitAll()
					.anyRequest().authenticated()
				.and()
					.formLogin()
						.loginPage("/login")
						.successHandler(loginSuccessHandler)
							.permitAll()
				.and()
					.logout()
						.invalidateHttpSession(true)
						.clearAuthentication(true)
						.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
						.logoutSuccessUrl("/login?logout")
							.permitAll();
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
		auth.setUserDetailsService(userService);
		auth.setPasswordEncoder(passwordEncoder());
		return auth;
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(authenticationProvider());
//		auth.inMemoryAuthentication()
//		.withUser("user").password("{noop}password").roles("USER")
//		.and()
//		.withUser("admin").password("{noop}password").roles("ADMIN");
		
	}

}
