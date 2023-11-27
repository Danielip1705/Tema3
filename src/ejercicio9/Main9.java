package ejercicio9;

import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		int num1=0, num2=0, ops=0 ;
		double res;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserte el primer numero");
		num1= sc.nextInt();
		System.out.println("Inserte el segundo numero");
		num2= sc.nextInt();
		System.out.println("Elige,Suma[1], Resta[2], Multiplicación[3], División[4] ");
		ops = sc.nextInt();
		res = Funciones9.calculadora(num1, num2, ops);
		System.out.println("El resultado de la operación es: " +res);
		sc.close();
	}

}
