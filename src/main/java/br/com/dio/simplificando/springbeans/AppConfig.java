package br.com.dio.simplificando.springbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Livro getLivro() {
		return new Livro();
	}
	/** Equivalente na versão XML :
	 * 
	 * <bean id="livro" class="br.com.dio.simplificando.springbeans.Livro" />
	 * 
	 * **/ 
	
	@Bean
	public AutorLivro getAutorLivro() {
		return new Autor();
	}
}
