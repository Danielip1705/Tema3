package Ejercicio3;

import java.util.Scanner;

public class main3 {

	public static void main(String[] args) {
		int num1,num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserta dos numeros para comprobar cual es el numero mayor");
		num1= sc.nextInt();
		num2 = sc.nextInt();
		
		funcion3.maximo(num1, num2);
	

	}

}
