package cadenas;

public class MetodosCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String = Clase
		
		String mensaje = "Hola, soy un String";
		
		int cantidad = mensaje.length();
		
		boolean contiene = mensaje.contains("u");
		
		boolean comienzaCon = mensaje.startsWith("H");
		
		boolean terminaCon = mensaje.endsWith("g");
		
		mensaje.startsWith("Hola");
		
		System.out.println(cantidad);
		System.out.println(contiene);
		System.out.println(comienzaCon);
		System.out.println(terminaCon);
		
		String nuevoString = mensaje.concat(", estamos en el curso de Java");
        System.out.println(nuevoString);
	}

}
