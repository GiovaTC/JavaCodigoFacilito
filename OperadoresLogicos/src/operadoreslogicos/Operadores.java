package operadoreslogicos;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Operadores logicos
		// and (y), or (o), y not (no)
		
		boolean resultado;
		
		resultado = 5 >= 5 && true && 10 > 9;
		System.out.println(resultado);
		
		resultado =  false || false || false || true;
		System.out.println(resultado);
		
		resultado = (5 >= (2 * 3) || true) && ( true && 10 > 5 );
		System.out.println(resultado);
		
		System.out.println(!false);
		//  true = false
		// false = true
		// 

	}

}
