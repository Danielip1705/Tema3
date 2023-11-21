package ejercicio4;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		String caracter;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba una vocal");
		
		caracter= sc.next();
		
		Funcion4.vocal(caracter);
		
		sc.close();
	}

}
