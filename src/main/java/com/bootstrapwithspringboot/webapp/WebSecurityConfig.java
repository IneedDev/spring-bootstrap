package com.bootstrapwithspringboot.webapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                //this sites will do not refer to login page which is carentallogin
                .antMatchers("/", "/home","/index","/contactlist","/addcontactform","/carrental","/hello","/carrentalapp","/calc").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/carrentallogin")
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }

    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        UserDetails user =
                User.withDefaultPasswordEncoder()
                        .username("a")
                        .password("a")
                        .roles("USER")
                        .build();

        return new InMemoryUserDetailsManager(user);
    }
}