package Program;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calcula area Retangulo = " + calculaAreaRetangulo(5.0,10.0));
		System.out.println("Calcula a Area = " + calculaAreaCircunferencia(5.0));
	}
	
	public static double calculaAreaRetangulo(double lado1, double lado2) {
		return  lado1 * lado2;
	}
	
	public static double calculaAreaCircunferencia(double raio) {
		double pi = 3.1416;
		double area = pi * (Math.pow(raio, 2));
		return area;
	}
	
	public static double calculaAreaTriangulo(double base, double altura) {
		
		return base ;
	}

}
