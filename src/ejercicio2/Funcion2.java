package ejercicio2;

public class Funcion2 {
	public static void funcion2(int num1, int num2) {
		int min = num1 < num2 ? num1 : num2;
		int max = num1 > num2 ? num1 : num2;
		for (int i = min; i <= max; i++) {
			System.out.println(i);
		}

	}
}
