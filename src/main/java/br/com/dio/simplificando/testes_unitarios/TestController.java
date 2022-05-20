package br.com.dio.simplificando.testes_unitarios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test")
	public String saudacao(String nome ) {
		return String.format("Bem Vindo, %s",nome);
	}
	
	@GetMapping("/test2")
	public String saudacao2(@RequestParam(name="nome",defaultValue = "DIO") String nome ) {
		return String.format("Bem Vindo, %s",nome);
	}
}
