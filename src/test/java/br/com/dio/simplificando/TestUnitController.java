package br.com.dio.simplificando;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.dio.simplificando.testes_unitarios.TestController;

public class TestUnitController {

	@Test
	public void testUnit() {
		TestController controller = new TestController();
		String resultado = controller.saudacao("DIO");
		Assertions.assertEquals("Bem Vindo, DIO",resultado);
	}
}
