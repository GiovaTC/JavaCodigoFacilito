package ciclos;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Do While
		int contador = 10;
		
		//  While -> 1.-Se evalua 2.-Se ejecuta el bloque
		// DoWhile -> 1.-Se evalua 2.-Se ejecuta el bloque
		
		while(contador < 10)
		{
			System.out.println(contador);
			contador++;
		}
		
		do {
			System.out.println(contador);
		} while(contador < 10);

	}

}
