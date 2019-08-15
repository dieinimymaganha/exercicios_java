package Program;

import java.util.Scanner;

public class CalculadoraEquacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Calculadora de Equações do 2º Grau !");
		System.out.print("Digite 'a': ");
		int a = sc.nextInt();
		System.out.print("Digite 'b': ");
		int b = sc.nextInt();
		System.out.print("Digite 'c': ");
		int c = sc.nextInt();
		
		calcula(a, b, c);

	}
	
	public static double[] calcula(double a, double b, double c) {
		double[] result = new double[2];
		
		double delta = (b * b) + (-4 * a * c);
		if(delta < 0 ) {
			throw new RuntimeException("Raiz imaginaria");
		}
		
		result[0] = (-b + Math.sqrt(delta)) / ( 2 * a);
		result[1] = (-b - Math.sqrt(delta)) / ( 2 * a);
		
		System.out.println(result[0]);
		System.out.println(result[1]);
		
		return result;
		
	}
}