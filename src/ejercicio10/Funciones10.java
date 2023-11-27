package ejercicio10;

public class Funciones10 {
	public static boolean fecha(int año, int mes, int dia) {
		boolean comprobacion = true;
		if (mes <= 0 || mes > 12 || dia <= 0 || dia > 30) {
			comprobacion = false;
		}
		return comprobacion;
	}
}
