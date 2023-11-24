package ejercicio7;

import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		int num;
		boolean res;

		Scanner sc = new Scanner(System.in);
		System.out.println("Inserta el numero primo");
		num = sc.nextInt();

		res = Funcion7.esPrimo(num);
		if (res) {
			System.out.println("Es primo");
		} else {
			System.out.println("No es primo");
		}
		
		sc.close();

	}

}
