package ejercicio8;

import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		int num;
		int contador;
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		contador = Funcion8.divisor(num);
		System.out.println("El numeros de divisores es: " +contador);
		sc.close();
	}

}
