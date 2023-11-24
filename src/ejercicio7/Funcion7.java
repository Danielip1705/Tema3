package ejercicio7;

public class Funcion7 {
	public static boolean esPrimo(int primo) {
		boolean Primos = true;
		if (primo == 1) {
			Primos=false;
		} else {
			for (int i = 2; i <= Math.sqrt(primo) && Primos == true; i++) {

				if (primo % i == 0) {
					Primos = false;

				}
			}
		}
		
		return Primos;
	}
}
