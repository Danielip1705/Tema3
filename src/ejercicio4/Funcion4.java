package ejercicio4;

public class Funcion4 {
	public static boolean vocal(String caracter) {
		boolean comprobacion=false;
		caracter=caracter.toLowerCase();
		
		switch (caracter) {
		case "a","e","i","o","u"->
			comprobacion=true;
		}
		return comprobacion;
		
	}

}
