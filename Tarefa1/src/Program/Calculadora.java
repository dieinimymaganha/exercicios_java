package Program;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calcula area Retangulo = " + calculaAreaRetangulo(5.0, 10.0));
		System.out.println("Calcula a Area = " + calculaAreaCircunferencia(5.0));
		System.out.println("Calula a area do triangulo = " + calculaAreaTriangulo(5.0, 10.0));
	}

	public static double calculaAreaRetangulo(double lado1, double lado2) {

		if (lado1 < 0 || lado2 < 0) {
			throw new RuntimeException("Numero negativo");
		}

		return lado1 * lado2;
	}

	public static double calculaAreaCircunferencia(double raio) {
		if (raio < 0) {
			throw new RuntimeException("Numero negativo");
		}
		double pi = 3.1416;
		double area = pi * (Math.pow(raio, 2));
		return area;
	}

	public static double calculaAreaTriangulo(double base, double altura) {
		if (base < 0 || altura < 0) {
			throw new RuntimeException("Numero negativo");
		}
		return (base * altura) / 2;
	}

}
