package application;

import entities.Circunferencia;

public class Program {

	public static void main(String[] args) {
		Circunferencia c = new Circunferencia(5.0, 10.0);
		
		System.out.println(c.area());

	}

}
