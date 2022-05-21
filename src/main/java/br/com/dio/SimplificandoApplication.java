package br.com.dio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.google.gson.Gson;

import br.com.dio.imersao.beans_vs_component.ConversorJson;
import br.com.dio.imersao.beans_vs_component.ViaCepResponse;
import br.com.dio.imersao.primeiros_passos.Calculadora;

@SpringBootApplication
@EnableFeignClients
public class SimplificandoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplificandoApplication.class, args);
	}
	
	
	@Bean
	public CommandLineRunner run(ConversorJson conversor) {
		return args -> {
			String json = "{ \"cep\": \"01001-000\", \"logradouro\": \"Praça da Sé\",\"localidade\": \"Centro\" }";
			ViaCepResponse response = conversor.converter(json);
			System.out.println("Dados do CEP : "+ response);
		};
	}

}
