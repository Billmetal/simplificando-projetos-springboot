package br.com.dio.imersao.properties_value;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagemProp implements CommandLineRunner {
	
	@Value("${name:NoReply-DIO}")
	private String nome;
	
	@Value("${email}")
	private String email;
	
	@Value("${telefones}")
	private List<Long> telefones;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Mensagem enviada por: " + nome + "\nEmail: " +
					email + "\nCom telefones: " + telefones);
		System.out.println("Seu cadastro foi aprovado");
	}

}
