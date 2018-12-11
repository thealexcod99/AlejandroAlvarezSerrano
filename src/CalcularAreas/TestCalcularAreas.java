package CalcularAreas;
import java.util.Scanner;

public class TestCalcularAreas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean salir = true;
		
		while (salir) {
		
			CalcularAreas.menu();
			System.out.print("Opción: ");	
			int opcion = sc.nextInt();
		
			switch (opcion) {
					
				case 1:
					System.out.print("Introduce la base del triángulo: ");
					int baset = sc.nextInt();
					
					if (baset <= 0) {
						System.out.println("El valor introducido no es válido");
						System.exit(1);
					}
					
					System.out.print("Introduce la altura del triángulo: ");
					int alturat = sc.nextInt();
					if (alturat <= 0) {
						System.out.println("El valor introducido no es válido");
						System.exit(1);
					}
					
					System.out.println("El área del triángulo es " + CalcularAreas.areaTriangulo(baset, alturat));
					System.out.println("");
					break;
				
				case 2:
					System.out.print("Introduce la base del rectángulo: ");
					int baser = sc.nextInt();
					if (baser < 2 || baser > 10) {
						System.out.println("El valor introducido no es válido");
						System.exit(1);
					}
					
					System.out.print("Introduce la altura del rectángulo: ");
					int alturar = sc.nextInt();
					if (alturar < 2 || alturar > 10) {
						System.out.println("El valor introducido no es válido");
						System.exit(1);
					}
					
					System.out.println("El área del rectángulo es " + CalcularAreas.areaRectangulo(baser, alturar));
					System.out.println("");
					break;
				
				case 3:
					System.out.print("Introduce la base inferior del trapecio: ");
					int basetr1 = sc.nextInt();					
					System.out.print("Introduce la base superior del trapecio: ");
					int basetr2 = sc.nextInt();
					if (basetr1 == basetr2) {
						System.out.println("Las bases no pueden ser iguales");
						System.exit(2);
					}
					
					System.out.print("Introduce la altura del trapecio: ");
					int alturatr = sc.nextInt();
					
					System.out.println("El área del trapecio es " + CalcularAreas.areaTrapecio(basetr1, basetr2, alturatr));
					System.out.println("");
					break;
				
				case 4:
					salir = false;
					break;
			}
		}
		sc.close();
		System.exit(3);
	}
}
