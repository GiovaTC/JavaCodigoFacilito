package comparar;

public class Comparar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena1 = "HOLA";
		String cadena2 = "hola";
		
		boolean resultado = cadena2.toUpperCase().equals(cadena1.toUpperCase());
		System.out.println(resultado);
		
		resultado = cadena1.equalsIgnoreCase(cadena2);
		System.out.println(resultado);

	}

}
