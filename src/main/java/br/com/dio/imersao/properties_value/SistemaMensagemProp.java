package br.com.dio.imersao.properties_value;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.dio.imersao.configuration_properties.RemetenteProp;

@Component
public class SistemaMensagemProp implements CommandLineRunner {
	
	@Autowired
	private RemetenteProp remetente;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Mensagem enviada por: " + remetente.getNome() + "\nEmail: " +
				remetente.getEmail() + "\nCom telefones: " + remetente.getTelefones());
		System.out.println("Seu cadastro foi aprovado");
	}

}
