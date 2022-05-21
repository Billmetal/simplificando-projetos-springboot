package br.com.dio.imersao.spring_data_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.dio.imersao.spring_data_jpa.model.User;
import br.com.dio.imersao.spring_data_jpa.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner{
	
	@Autowired
	private UserRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new User("Willian","Bill","dio123"));
		repository.save(new User("Gleyson","glysns","dio111"));
		
		for (User u : repository.findAll()) {
			System.out.println(u);
		}
	}

}
