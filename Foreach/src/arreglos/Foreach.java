package arreglos;

public class Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int calificaciones[] = {9, 8, 7, 10 , 10, 9, 8, 8, 10, 9};
		int suma = 0;
		
		for (int calificacion : calificaciones)
		{
			suma += calificacion;
		}
		
		float promedio = suma / calificaciones.length;
		System.out.println(" El promedio es " + promedio);

	}

}
