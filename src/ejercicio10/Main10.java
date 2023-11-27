package ejercicio10;

import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		int año, mes, dia;
		boolean comp;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserte el año");
		año= sc.nextInt();
		
		System.out.println("Inserte el mes");
		mes = sc.nextInt();
		
		System.out.println("Inserte el dia");
		dia = sc.nextInt();
		
		comp = Funciones10.fecha(año, mes, dia);
		if (comp==true) {
			System.out.println("La fecha insertada es correcta");
		} else {
			System.out.println("La fecha insertada es incorrecta");
		}
		sc.close();
	}

}
