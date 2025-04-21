package scopeoalcance;

public class ScopeoAlcance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escope
		
		int promedio = 5;
		String mensajeTres;
		
		if (promedio > 7)
		{
			String mensaje = "Felicidades, tu promedio es Excelente: " + promedio;
			
			if (promedio == 10)
			{
				System.out.println(mensaje);
			}
			
			if (promedio < 10)
			{
				String mensajeDos = "Felicidades, tu promedio  es muy bueno: " + promedio;
				System.out.println(mensajeDos);
			}		
		}else if ( promedio < 7)
		{
		     mensajeTres = "Lo siento, tu promedio  es muy bajo: " + promedio;
		     System.out.println(mensajeTres);
		}
	}
}
