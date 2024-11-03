package music.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfiguration {
    @Bean
    public SecurityFilterChain  securityFilterChain(HttpSecurity httpSecurity) throws Exception {
          
        httpSecurity.authorizeHttpRequests(authorize ->{
            authorize.requestMatchers("/user/**").authenticated();
            authorize.anyRequest().permitAll();
        });
        
        httpSecurity.formLogin(formlogin ->{
            formlogin.loginPage("/login")
            .loginProcessingUrl("/checklogin")
            .successForwardUrl("/user/home")
            .failureForwardUrl("/login?error=true")
            .usernameParameter("email")
            .passwordParameter("password");
        });

        return null;

        
    }
}
