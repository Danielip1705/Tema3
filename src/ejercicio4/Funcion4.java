package ejercicio4;

public class Funcion4 {
	public static void vocal(String caracter) {
		boolean comprobacion;
		caracter=caracter.toLowerCase();
		if (caracter.equals("a")||caracter.equals("e")||caracter.equals("i")
				||caracter.equals("o")||caracter.equals("u")) {
			comprobacion=true;
			System.out.println(comprobacion);
		} else {
			comprobacion=false;
			System.out.println(comprobacion);
		}
		
	}

}
