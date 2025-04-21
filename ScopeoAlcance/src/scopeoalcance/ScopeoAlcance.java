package scopeoalcance;

public class ScopeoAlcance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escope
		
		int promedio = 10;
		
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
		}
	}

}
