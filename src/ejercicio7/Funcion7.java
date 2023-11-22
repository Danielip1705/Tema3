package ejercicio7;

public class Funcion7 {
	public static boolean esPrimo(int primo) {
		boolean esPrimo = false;

		if (primo % primo == 0) {
			esPrimo = false;
		} else {
			esPrimo = true;
		}

		return esPrimo;
	}
}
