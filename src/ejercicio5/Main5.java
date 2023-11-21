package ejercicio5;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserte un numero para que salga su tabla de multiplicacion");
		
		n=sc.nextInt();
		
		Funcion5.tablamulti(n);

	}

}
