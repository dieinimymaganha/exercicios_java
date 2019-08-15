package Test;

import static org.junit.Assert.fail;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import Program.Calculadora;

public class TestCalculadora {
	
	@Test
	public void testaRetangulo() {
		double result;
		
		// Testando se a conta está correta
		result = Calculadora.calculaAreaRetangulo(5.0, 10.0);
		assertEquals(50.0, result);
	}
	
	@Test
	public void testaRetanguloNegativo() {
		double result;
		
		// Testando lado1
		try {
			result = Calculadora.calculaAreaRetangulo(-5.0, 10.0);
			fail("Levantar Exceção");
		}catch (Exception e) {
			String message =  e.getMessage();
			assertEquals("Numero negativo", message);
		}
		
		// Testando lado2
		try {
			result = Calculadora.calculaAreaRetangulo(5.0, -10.0);
			fail("Levantar Exceção");
		}catch (Exception e) {
			String message =  e.getMessage();
			assertEquals("Numero negativo", message);
		}		
		
	}
	
	@Test
	public void testaAreaCircunferencia() {
		// Testando se a conta está correta
		double result;
		
		result = Calculadora.calculaAreaCircunferencia(5.0);
		assertEquals(78.53999999999999, result);
	}
	
	@Test
	public void testaAreaCircunferenciaNegativo() {
		double result;
		
		// Testando lado1
		try {
			result = Calculadora.calculaAreaCircunferencia(-5.0);
			fail("Levantar Exceção");
		}catch (Exception e) {
			String message =  e.getMessage();
			assertEquals("Numero negativo", message);
		}
	
	}
	
	@Test
	public void testaAreaTriangulo() {
		// Testando se a conta está correta
		double result;
		result = Calculadora.calculaAreaTriangulo(5.0, 10.0);
		assertEquals(25.0, result);
		
	}
	
	@Test
	public void testaAreaTrianguloNegativo() {
		double result;
		
		// Testando base negativa
		try {
			result = Calculadora.calculaAreaTriangulo(-5.0,10.0);
			fail("Levantar Exceção");
		}catch (Exception e) {
			String message =  e.getMessage();
			assertEquals("Numero negativo", message);
		}
		// Testando area negativa
		try {
			result = Calculadora.calculaAreaTriangulo(5.0,-10.0);
			fail("Levantar Exceção");
		}catch (Exception e) {
			String message =  e.getMessage();
			assertEquals("Numero negativo", message);
		}
		
	}

}
