package br.com.dio.imersao.scopes_singleton_prototype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {

	@Bean
	@Scope("prototype")
	public Remetente remetente() {
		System.out.println("CRIANDO OBJETO REMETENTE");
		Remetente remetente = new Remetente();
		remetente.setEmail("noReply@dio.com.br");
		remetente.setNome("Digital Innovation One");
		return remetente;
	}
}
