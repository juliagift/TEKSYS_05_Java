package org.juliagift.copayprogram.configuration;

import org.juliagift.copayprogram.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private PatientService patientService;
	
	//Tell Spring Security to allow public unauthenticated access to the endpoints /registration and /home
		 @Override
		   protected void configure(HttpSecurity http) throws Exception {
		       http
		       .authorizeRequests()
		       
	           .antMatchers(
	                   "/home**",
	                   "/js/**",
	                   "/css/**",
	                   "/img/**",
	                   "/webjars/**")
	           			.permitAll()
	           .anyRequest().authenticated()
	       .and()
	           .formLogin()
	               .loginPage("/login")
//	               .usernameParameter("email")
//	               .passwordParameter("password")
//	               .defaultSuccessUrl("/index", false)
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
		   public BCryptPasswordEncoder passwordEncoder(){
		       return new BCryptPasswordEncoder();
		   }

		 @Bean
		   public DaoAuthenticationProvider authenticationProvider(){
		       DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
		       auth.setUserDetailsService(userService);
		       auth.setPasswordEncoder(passwordEncoder());
		       return auth;
		   }

		 @Override
		   protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		       auth.authenticationProvider(authenticationProvider());
		   }

}
