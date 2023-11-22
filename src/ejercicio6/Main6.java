package ejercicio6;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radio,altura,resultado;
		int ops;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba la opcion 1(area)o 2(volumen)");
		ops = sc.nextInt();
		
		System.out.println("Escriba el radio");
		radio = sc.nextDouble();
		
		System.out.println("Escriba la altura");
		altura = sc.nextDouble();
		
		resultado = Funcion6.cilindro(radio, altura, ops);
		
		System.out.println(resultado);
		sc.close();
	}

}
