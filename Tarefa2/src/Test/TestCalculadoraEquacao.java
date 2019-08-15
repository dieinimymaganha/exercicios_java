package Test;

import Program.CalculadoraEquacao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TestCalculadoraEquacao {

	@Test
	public void testa() {
		double[] resultado;
		
		//Primeiro Teste
		resultado = CalculadoraEquacao.calcula(1, 0, -9);
		assertEquals(3, resultado[0], 0.0);
		assertEquals(-3, resultado[1], 0.0);
		
		//Segundo Teste
		resultado = CalculadoraEquacao.calcula(1, -9, 0);
		assertEquals(9, resultado[0], 0.0);
		assertEquals(0, resultado[1], 0.0);
		
		//Terceiro teste
		resultado = CalculadoraEquacao.calcula(3, -7, 2);
		assertEquals(2, resultado[0], 0.0);
		assertEquals(0.3333333333333333, resultado[1], 0.0);

		//Quarto teste
		resultado = CalculadoraEquacao.calcula(-1, 4, -4);
		assertEquals(2, resultado[0], 0.0);
		assertEquals(2, resultado[1], 0.0);
	}
	
	@Test
	public void testRaizImaginaria() {
		double[] resultado;
		
		try {
			resultado = CalculadoraEquacao.calcula(-3, -1, -2);
			fail("Levantar exceção");
		}catch (Exception e) {
			String message =  e.getMessage();
			assertEquals("Raiz imaginaria", message);
		}
		
	}

}
