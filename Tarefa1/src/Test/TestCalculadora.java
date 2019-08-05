package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Program.Calculadora;

public class TestCalculadora {
	
	@Test
	public void testaRetangulo() {
		double a;
		
		a = Calculadora.calculaAreaRetangulo(5.0, 10.0);
		
		assertEquals(50.0, a, 50.0);
		
	}
	

}
