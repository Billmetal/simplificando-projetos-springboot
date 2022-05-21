package br.com.dio.imersao.spring_data_jpa;

import java.util.List;

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
		
		List<User> users = repository.findByNameContaining("Gleyson");
		
		for (User u : users) {
			System.out.println(u);
		}
	}
	
	private void insertUser() {
		repository.save(new User("Gleyson Sampaio","glysns","dio111"));
		
		for (User u : repository.findAll()) {
			System.out.println(u);
		}
	}

}
