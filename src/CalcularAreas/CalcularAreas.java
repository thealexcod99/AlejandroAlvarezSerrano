package CalcularAreas;

public class CalcularAreas {

	public static void menu() {
		
		System.out.println("¿De qué figura deseas calcular el área?");
		System.out.println("-Triángulo (Pulsa 1).");
		System.out.println("-Rectángulo (Pulsa 2).");
		System.out.println("-Trapecio (Pulsa 3).");
		System.out.println("");
		System.out.println("Para salir del programa pulsa 4.");
		
	}
	
	public static double areaTriangulo( int base, int altura ) {
		return base * altura / 2.0;
	}
	
	public static int areaRectangulo( int base, int altura ) {
		return base * altura;
	}
	
	public static double areaTrapecio( int base1, int base2, int altura ) {
		return altura * ((base1 + base2) / 2.0);
	}
	
	
}
