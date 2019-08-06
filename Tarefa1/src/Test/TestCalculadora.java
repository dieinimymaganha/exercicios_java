package Test;

import org.junit.Assert;

import org.junit.Test;

import Program.Calculadora;

public class TestCalculadora {
	
	@Test
	public void testaRetangulo() {
		double a;
		
		// Testando se a conta está correta
		a = Calculadora.calculaAreaRetangulo(5.0, 10.0);
		Assert.assertEquals(50.0, a, 50.0);
		
		// Caso o lado2 seja negativo incluo o valor zero
		a = Calculadora.calculaAreaRetangulo(-5.0, 10.0);
		Assert.assertEquals(0.0, a, 0.0);

		// Caso o lado2 seja negativo incluo o valor zero		
		a = Calculadora.calculaAreaRetangulo(5.0, -10.0);
		Assert.assertEquals(0.0, a, 0.0);
		
	}
	

}
