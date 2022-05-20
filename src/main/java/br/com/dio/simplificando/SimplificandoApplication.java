package br.com.dio.simplificando;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SimplificandoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplificandoApplication.class, args);
	}

}
