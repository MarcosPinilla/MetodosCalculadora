package calculadoraMetodos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraConMetodos {
	
	public static int Sumar(int num1, int num2) {
		return (num1 + num2);
	}

	public static int Restar(int num1, int num2) {
		return (num1 - num2);
	}

	public static int Multiplicar(int num1, int num2) {
		return (num1 * num2);
	}

	public static float Dividir(float num1, float num2) {
		float cociente = (num2 != 0) ? (float) num1 / num2 : num1 / num2;
		return cociente;
	}

	public static int Mayor(int num1, int num2) {
		return Math.max(num1, num2);
	}

	public static double Potencia(double num1, double num2) {
		return Math.pow(num1, num2);
	}

	public static void Menu() {
		System.out.println("////////////MENU////////////");
		System.out.println("1.- Sumar dos números");
		System.out.println("2.- Restar dos números");
		System.out.println("3.- Multiplicar dos números");
		System.out.println("4.- Dividir dos números");
		System.out.println("5.- Mostrar el Mayor de dos numeros");
		System.out.println("6.- Calcular Potencia");
		System.out.println("7.- Salir del programa");
		System.out.println("////////////////////////////");
		Leeropc();
	}

	public static void Leeropc() {
		Scanner scn = new Scanner(System.in);
		int opcion = 0;
		opcion = scn.nextInt();
		boolean ciclo = true;
		do {
			try {
				switch (opcion) {
				case 1:
					System.out.println("La Suma es: " + Sumar(Leer(scn), Leer(scn)));
					break;

				case 2:
					System.out.println("La Resta es: " + Restar(Leer(scn), Leer(scn)));
					break;
				case 3:
					System.out.println("El Producto es: " + Multiplicar(Leer(scn), Leer(scn)));
					break;
				case 4:
					System.out.println("El Cociente es: " + Dividir(Leer(scn), Leer(scn)));
					break;
				case 5:
					System.out.println("El Mayor es: " + Mayor(Leer(scn), Leer(scn)));
					break;
				case 6:
					System.out.println("La Potencia es: " + Potencia(Leer(scn), Leer(scn)));
					break;
				case 7:
					Salir(scn);
					break;

				default:
					System.out.println("-----------------------------------");
					System.out.println("Opción inválida; ingrese de nuevo.");
					break;

				}
				while (opcion != 7)
					Menu();
				ciclo = false;
			} catch (InputMismatchException exc) {
				scn.nextLine();
				System.out.println("Solo se Aceptan Números");
			} catch (ArithmeticException exc) {
				scn.nextLine();
				System.out.println("No se Acepta CERO como Divisor");
			}

		} while (ciclo);

	}

	public static int Leer(Scanner scn) {
		System.out.println("Ingrese un Numero:");
		return scn.nextInt();
	}

	public static void Salir(Scanner scn) {
		int num1 = 0;
		boolean ciclo = true;
		do {
			System.out.println("¿De verdad quiere salir?(1.SI/2.NO)");
			num1 = Leer(scn);
			while (num1 > 2 || num1 < 1) {
				System.out.println("Opción inválida, ingrese de nuevo");
				Leer(scn);
			}
			if (num1 == 1) {
				System.out.println("Hasta Luego...");
			}
			if (num1 == 2) {
				System.out.println("-----------------------------");
				Menu();
			}
			ciclo = false;
		} while (ciclo);
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		boolean ciclo = true;
		do {
			try {
				Menu();
				ciclo = false;
			} catch (InputMismatchException exc) {

				System.out.println("Solo se Aceptan Números");

			}
		} while (ciclo);
		scn.close();
	}

}
