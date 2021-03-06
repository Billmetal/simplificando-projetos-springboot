package br.com.dio.imersao.primeiros_passos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
	
	@Autowired
	private Calculadora calculo;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("o resultado é " + calculo.somar(2,8));
	}

}
