package entities;

public class Circunferencia {
	double lado1;
	double lado2;

	public Circunferencia(double lado1, double lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	public double area() {
		return this.lado1 * this.lado2;		
	}
}
