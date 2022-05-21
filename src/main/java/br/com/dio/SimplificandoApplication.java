package br.com.dio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import br.com.dio.imersao.primeiros_passos.Calculadora;

@SpringBootApplication
@EnableFeignClients
public class SimplificandoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplificandoApplication.class, args);
	}

}
