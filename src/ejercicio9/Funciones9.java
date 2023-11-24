package ejercicio9;

public class Funciones9 {
	public static void calculadora(int num1, int num2, int opcion) {
		int res=0;
		switch (opcion) {
		case 1:
			res = num1+num2;
			break;
		case 2:
			res= num1-num2;
			break;
		case 3:
			res = num1*num2;
			break;
		case 4:
			res = num1/num2;
			break;
			default:
				System.out.println("Solo se admite los numeros: 1[Suma]2[Resta]3[Multiplicación]4[División]");
		}
	}
}
