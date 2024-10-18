package com.sourav.SpringSecurity01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity security) throws Exception {

        //Here we disabled csrf token validation
        security.csrf(token -> token.disable());

        //Here we specify all the request should be authenticated
        security.authorizeHttpRequests(requestMatcherRegistry -> requestMatcherRegistry.anyRequest().authenticated());

        // Here we enable form-based authentication. This configures Spring Security to use a default form login page
        //security.formLogin(Customizer.withDefaults());

        // Here we enable HTTP Basic authentication. This configures Spring Security to use HTTP Basic for authentication
        security.httpBasic(Customizer.withDefaults());

        // Here we configure the session management policy to be stateless.
        // This means the server will not create or use sessions to store user state between requests
        security.sessionManagement(session -> session.sessionCreationPolicy(
                SessionCreationPolicy.STATELESS
        ));

        return security.build();
    }

}
