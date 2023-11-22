package ejercicio4;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		String caracter;
		boolean res;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba una vocal");
		
		caracter= sc.next();
		
		res=Funcion4.vocal(caracter);
		if (res==true) {
			System.out.println("Es una vocal");
		} else {
			System.out.println("No es una vocal");
		}
		
		sc.close();
	}

}
