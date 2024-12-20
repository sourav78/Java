package com.sourav.SpringSecurity01.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private JWTFilter jwtFilter;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity security) throws Exception {

        //Here we disabled csrf token validation
        security.csrf(token -> token.disable());

        //Here we specify all the request should be authenticated
        security.authorizeHttpRequests(requestMatcherRegistry -> requestMatcherRegistry
                .requestMatchers(
                        "/u/total-user",
                        "/u/register",
                        "/u/login"
                ).permitAll() //Unauthenticated URLs
                .anyRequest().authenticated()
        );

        // Here we enable form-based authentication. This configures Spring Security to use a default form login page
        //security.formLogin(Customizer.withDefaults());

        // Here we enable HTTP Basic authentication. This configures Spring Security to use HTTP Basic for authentication
        security.httpBasic(Customizer.withDefaults()); // IF you want to disable basicAuth authentication Then remove httpBasic method

        // Here we configure the session management policy to be stateless.
        // This means the server will not create or use sessions to store user state between requests
        security.sessionManagement(session -> session.sessionCreationPolicy(
                SessionCreationPolicy.STATELESS
        ));

        security.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);

        return security.build();
    }

    //Here we specify our own authentication
    @Bean
    public AuthenticationProvider getAuthenticationProvider(){
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();

        //Password encode to encode password
        provider.setPasswordEncoder(new BCryptPasswordEncoder(12));

        //Here we can specify our own user details service
        provider.setUserDetailsService(userDetailsService);
        return provider;
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }

    //In this service we create hardcoded users for the application
//    @Bean
//    public UserDetailsService userDetailsService(){
//
//        //Here we create users using UserDetails Interface
//        UserDetails user1 = User
//                .withDefaultPasswordEncoder()
//                .username("salu")
//                .password("s123")
//                .build();
//        UserDetails user2 = User
//                .withDefaultPasswordEncoder()
//                .username("situ")
//                .password("s111")
//                .build();
//
//        //Here we pass the users to spring security.
//        return new InMemoryUserDetailsManager(user1,user2);
//    }
}
