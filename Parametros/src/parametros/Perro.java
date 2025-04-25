package parametros;

public class Perro {
	
	String nombre;
	String raza;
	int edad;
	
	//Parámetros
	
	void establecerAtributos(String nombrePerro, String razaPerro, int edadPerro)
	{
		nombre = nombrePerro;
		raza =  razaPerro;
		edad = edadPerro;
	}
	
	void comer()
	{
		System.out.println("El perro se encuentra comiendo!");
	}
	
	void dormir()
	{
		System.out.println("El perro se encuentra dormido!");
	}
	
	void ladrar()
	{
		System.out.println("El perro se encuentra ladrando!");
	}

}
