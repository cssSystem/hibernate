package sys.tem;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableGlobalMethodSecurity(
        prePostEnabled = true,
        securedEnabled = true,
        jsr250Enabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                .and()
                .authorizeRequests().antMatchers("/persons/by-city").permitAll()
                .and()
                .authorizeRequests().antMatchers("/persons/by-age").hasAuthority("write")
                .and()
                .authorizeRequests().antMatchers("/persons/by-nameSurname").hasAuthority("read")
                .and()
                .authorizeRequests().anyRequest().authenticated();

    }

    @Override
    protected void configure(AuthenticationManagerBuilder mng) throws Exception {
        mng.inMemoryAuthentication()
                .withUser("noname")
                .password("{noop}nopass")
                .authorities("read", "write")
                .and()
                .withUser("noname1")
                .password("{noop}nopass1")
                .roles("READ")
                .and()
                .withUser("noname2")
                .password("{noop}nopass2")
                .roles("WRITE")
                .and()
                .withUser("noname3")
                .password("{noop}nopass3")
                .roles("DELETE");
    }
}