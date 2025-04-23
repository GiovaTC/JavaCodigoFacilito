package arreglos;

public class RecorrerArreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arreglos
		
		int calificaciones[] = { 9, 8, 7, 10, 10, 9, 8, 8, 10, 9};
		int suma = 0;
		
		for( int indice = 0; indice < calificaciones.length; indice++ )
		{
			suma += calificaciones[indice];
		}
		
		float promedio = suma / calificaciones.length;
		System.out.println("El promedio es "+ promedio);

	}

}
