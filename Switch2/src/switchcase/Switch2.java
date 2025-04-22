package switchcase;

public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Switch
		char calificacion = 'M';
		
		switch(calificacion)
		{
		case 'A':
			System.out.println("Excelente!");
			break;
		case 'B':
			System.out.println("Bien hecho");
			break;
		case 'C':
			System.out.println("Bien hecho");
			break;
		case 'D':
			System.out.println("Aprobatorio");
			break;
		case 'F':
			System.out.println("Puedes mejorar");
			break;
		default:
			System.out.println("Calificación no válida");
		}

	}

}
