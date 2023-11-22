package ejercicio6;

public class Funcion6 {
	public static double cilindro(double radio, double altura, int num) {
		double resultado=0;
		double pi = Math.PI;
		switch (num) {
		case 1:
			resultado = 2 * pi * radio * (altura + radio);
			break;
		case 2:
			resultado = pi * (radio * radio) * altura;
			break;
		default:
			System.out.println("Solo puedes elegir 1(area) o 2(volumen)");
		}
		return resultado;
	}

}
