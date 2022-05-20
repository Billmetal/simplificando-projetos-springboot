package br.com.dio.simplificando;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

@WebMvcTest
@ExtendWith(SpringExtension.class)
public class TestIntegrationController {

	@Autowired
	private MockMvc mvc;
	
	
	@Test
	public void testeIntegration() throws Exception {
		RequestBuilder requisicao = get("/test2");
		MvcResult resultado = mvc.perform(requisicao).andReturn();
		Assertions.assertEquals("Bem Vindo, DIO",resultado.getResponse().getContentAsString());
	}
	
	@Test
	public void testeIntegrationParam() throws Exception {
		mvc.perform(get("/test2?nome=Willian"))
			.andExpect(content().string("Bem Vindo, Willian"));
	}
}
