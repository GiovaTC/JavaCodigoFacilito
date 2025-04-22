package ciclos;

public class CicloWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 0;
	    int numero = 55000;
	    
	    // 100 / 10 = 10
	    // 250 / 20 = 25
		
		while ( numero > 0)
		{
			numero = numero / 10;
			contador++;
		}
		
		System.out.println("El número posee  " + contador + " dígitos");

	}

}
