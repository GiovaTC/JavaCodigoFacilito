package metodosdeformato;

public class MetodosParte2 {

	public static void main(String[] args) {
    // String = Clase
		
		String mensaje = "";
		String curso = "Java";
		
		float valor = 10.872040f;
		
		mensaje = String.format("El total de %d articulos es %.2f %s", 3, valor, "MX");
		
		System.out.println(mensaje);
		System.out.printf("El total de %d articulos es %.2f %s", 3, valor, "MX");
		

	}

}
