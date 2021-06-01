package com.example.demo.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class ApplicationConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;

	@Autowired
	AuthSuccessHandler authSuccessHandler;
	
	@Autowired
	FailHandler authFailerHandler;
	
	@Bean(name="passwordEncoder")
    public PasswordEncoder passwordencoder(){
     return new BCryptPasswordEncoder();
    }
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception 
	{
		 auth.userDetailsService(userDetailsService).passwordEncoder(passwordencoder());

	}
	@Override
	protected void configure(HttpSecurity http) throws Exception 
	{
		 http.authorizeRequests()
		  .antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
		  .antMatchers("/student/**").access("hasRole('ROLE_USER')")
		  .anyRequest().permitAll()
		  .and()
		    .formLogin().loginPage("/login")
		    .usernameParameter("userName").passwordParameter("password").successHandler(authSuccessHandler)
		  .failureHandler(authFailerHandler).and()
		    .logout().logoutSuccessUrl("/login?logout") 
		   .and()
		   .exceptionHandling().accessDeniedPage("/403")
		  .and()
		    .csrf().disable();
	}
}
