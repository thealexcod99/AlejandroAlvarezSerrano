package CalcularAreas;
import java.util.Scanner;

public class TestCalcularAreas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CalcularAreas.menu();
		
		int opcion = sc.nextInt();
		
		if (opcion == 1) {
			System.out.println(CalcularAreas.areaTriangulo(sc.nextInt(), sc.nextInt()));
		}
		else if (opcion == 2) {
			System.out.println(CalcularAreas.areaRectangulo(sc.nextInt(), sc.nextInt()));
		}
		else if (opcion == 3) {
			System.out.println(CalcularAreas.areaTrapecio(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		}
		else if (opcion == 4) {
			System.exit(1);
		}

	}

}
