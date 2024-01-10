package fr.fee.tekourse.feetekourse.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@Profile("local")
public class LocalSecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
                //Pour effectuer des curl en local sur les APIs
                .csrf(AbstractHttpConfigurer::disable)
                //Pour pouvoir utiliser la console h2
                .headers(header -> header.frameOptions(HeadersConfigurer.FrameOptionsConfig::disable))
                .build();
    }
}
