package CalcularAreas;

public class CalcularAreas {
	
	//Método void que genera el menú.
	public static void menu() {
		
		System.out.println("¿De qué figura deseas calcular el área?");
		System.out.println("-Triángulo (Pulsa 1).");
		System.out.println("-Rectángulo (Pulsa 2).");
		System.out.println("-Trapecio (Pulsa 3).");
		System.out.println("");
		System.out.println("Para salir del programa pulsa 4.");
		
	}
	
	//Método que calcula el área del triángulo y la retorna.
	public static double areaTriangulo( int base, int altura ) {
		return base * altura / 2.0;
	}
	
	//Método que calcula el área del rectángulo y la retorna.
	public static int areaRectangulo( int base, int altura ) {
		return base * altura;
	}
	
	//Método que calcula el área del trapecio y la retorna.
	public static double areaTrapecio( int base1, int base2, int altura ) {
		return altura * ((base1 + base2) / 2.0);
	}
}
