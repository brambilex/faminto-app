package server.confs;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.inMemoryAuthentication()
			.withUser("cozinheiro")
				.password("cozinheiro")
				.roles("COZINHEIRO")
				.and()
			.withUser("entregador")
				.password("entregador")
				.roles("ENTREGADOR")
				.and()
			.withUser("admin")
				.password("admin")
				.roles("COZINHEIRO","ENTREGADOR","ADMIN");

}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
			.antMatchers("/produto/**").hasRole("ADMIN")
			.antMatchers("/cardapio").permitAll()
			.antMatchers("/carrinho/***").permitAll()
			.antMatchers("/**").permitAll()
			.antMatchers("/pedido/**").permitAll()
			.and().formLogin()
			.and().csrf().disable();
		 
	}

	}

