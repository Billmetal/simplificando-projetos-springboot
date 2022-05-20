package br.com.dio.simplificando.testes_unitarios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test")
	public String saudacao(String nome ) {
		return String.format("Bem Vindo, %s",nome);
	}
}
