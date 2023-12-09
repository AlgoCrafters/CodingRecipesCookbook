package com.algocrafters.demos.spring.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Main API security configuration.
 *
 * @author vitali.tchalov@algocrafters.com
 * @since 0.1
 */
@Configuration
@EnableWebSecurity
public class ApiSecurityConfiguration {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.authorizeHttpRequests(authorize -> authorize
                // NOTE: the order in which the matchers are specified DOES matter.
                // It should provide more control to arrange them in more secure to more permissive.
                        .requestMatchers("/v1/public/**").permitAll()
                )
//                .httpBasic(Customizer.withDefaults())
                // TODO: 2023-12-09 temporary disabled while there is only a single available API permitted to public access.
                .csrf(AbstractHttpConfigurer::disable)
                .build();
    }
}
