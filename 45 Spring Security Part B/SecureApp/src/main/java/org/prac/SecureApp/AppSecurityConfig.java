package org.prac.SecureApp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

	@Bean
	@Override
	protected UserDetailsService userDetailsService() {
		List<UserDetails> userList = new ArrayList<UserDetails>();
		userList.add(User.withDefaultPasswordEncoder().username("Dhwani").password("password").roles("USER").build());
		return new InMemoryUserDetailsManager(userList);
	}
}
