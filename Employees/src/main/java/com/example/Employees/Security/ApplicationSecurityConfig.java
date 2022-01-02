//package com.example.Employees.Security;
//
//
//
//import com.example.Employees.Auth.ApplicationUserService;
//import com.example.Employees.Auth.AuthenticationFilter;
//import com.example.Employees.Auth.TokenVerifier;
//import com.google.common.collect.ImmutableList;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    final private PasswordEncoder passwordEncoder;
//    final private ApplicationUserService service;
//
//    @Autowired
//    public ApplicationSecurityConfig(PasswordEncoder passwordEncoder, ApplicationUserService service) {
//        this.passwordEncoder = passwordEncoder;
//        this.service = service;
//    }
//
//
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .cors()
//                .and()
//                .csrf().disable()
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                .and()
//                .addFilter(new AuthenticationFilter(authenticationManager()))
//                .addFilterAfter(new TokenVerifier(), UsernamePasswordAuthenticationFilter.class)
//                .authorizeRequests()
//                .antMatchers("/Register").permitAll()
//                .antMatchers("/LogIn").permitAll()
//                //.antMatchers(HttpMethod.GET,"/Search/**").hasAuthority(ApplicationUserPermission.EMPLOYEE_READ.getPermission())
//                //.antMatchers(HttpMethod.POST,"/Create").hasAuthority(ApplicationUserPermission.EMPLOYEE_WRITE.getPermission())
//                .anyRequest()
//                .authenticated();
//                /*.and()
//                .httpBasic();
//                /*.formLogin()
//                .and()
//                .rememberMe().tokenValiditySeconds((int) TimeUnit.DAYS.toSeconds(30))
//                .and()
//                .logout()
//                .clearAuthentication(true)
//                .invalidateHttpSession(true)
//                .deleteCookies("JSESSIONID");*/
//    }
//
//
//
//    @Bean
//    public CorsConfigurationSource corsConfigurationSource() {
//        final CorsConfiguration configuration = new CorsConfiguration();
//        configuration.setAllowedOrigins(ImmutableList.of("http://localhost:4200"));
//        configuration.setAllowedMethods(ImmutableList.of("HEAD",
//                "GET", "POST", "PUT", "DELETE", "PATCH"));
//        // setAllowCredentials(true) is important, otherwise:
//        // The value of the 'Access-Control-Allow-Origin' header in the response must not be the wildcard '*' when the request's credentials mode is 'include'.
//        configuration.setAllowCredentials(true);
//        // setAllowedHeaders is important! Without it, OPTIONS preflight request
//        // will fail with 403 Invalid CORS request
//        configuration.setAllowedHeaders(ImmutableList.of("Access-Control-Expose-Headers","token", "Content-Type"));
//        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", configuration);
//        return source;
//    }
//
//
//}