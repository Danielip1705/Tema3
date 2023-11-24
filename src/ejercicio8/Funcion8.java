package ejercicio8;

import ejercicio7.Funcion7;

public class Funcion8 {
	public static int divisor(int num) {
		boolean esPrimo = true;
		int contador = 0;
		if (num == 1) {
			esPrimo = false;
		} else {
			
			for (int i = 2; i <=num/2 && esPrimo == true; i++) {
				if (Funcion7.esPrimo(i)==esPrimo) {
					contador++;
				}
			}
		}
		return contador;
	}
}
