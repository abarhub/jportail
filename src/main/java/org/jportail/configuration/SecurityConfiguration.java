package org.jportail.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
//import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

//    @Bean
//    SecurityFilterChain securityFilterChain(HttpSecurity http) {
//        // @formatter:off
//        http
//                .authorizeHttpRequests((requests) -> requests
//                        .requestMatchers("/", "/home").permitAll()
//                        .anyRequest().permitAll()
////                        .anyRequest().authenticated()
//                );
////                .formLogin((form) -> form
////                        .loginPage("/login")
////                        .permitAll()
////                )
////                .logout(LogoutConfigurer::permitAll);
//        // @formatter:on
//
//
//        return http.build();
//    }

}
