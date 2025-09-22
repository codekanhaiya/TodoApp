package com.todo.todoapp.disabled;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.Customizer;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.core.userdetails.User;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.provisioning.InMemoryUserDetailsManager;
// import org.springframework.security.web.SecurityFilterChain;

// @Configuration
// @EnableWebSecurity
public class UserbasicConfig {

    // @Bean
    // // @ Order(1)
    // public SecurityFilterChain basicSecurityFilterChain(HttpSecurity httpSecurity) throws Exception{

    //     httpSecurity
    //     // .securityMatcher("userbasic/**")
    //     .authorizeHttpRequests((requests) -> requests
    //         .requestMatchers("/userbasic/public").permitAll()
    //         .requestMatchers("/userbasic/account").hasRole("USER")
    //         .requestMatchers("/userbasic/admin").hasRole("ADMIN")
    //         .anyRequest().authenticated()
    //     ).httpBasic((Customizer.withDefaults()));
    //     return httpSecurity.build();
    // }

    // @Bean
    // public UserDetailsService basicUserDetailsService(){

    //     UserDetails admin = User.withDefaultPasswordEncoder()
    //     .username("admin")
    //     .password("admin")
    //     .roles("ADMIN", "USER")
    //     .build();

    //     UserDetails user = User.withDefaultPasswordEncoder()
    //     .username("user")
    //     .password("user")
    //     .roles("USER")
    //     .build();

    //     return new InMemoryUserDetailsManager(admin, user);

    // }
}
