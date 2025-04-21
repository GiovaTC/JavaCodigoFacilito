package condiciones;

public class CondicionesAnidadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int promedio = 6;
		
		if (promedio >= 7)
		{
		    if (promedio == 10)
		    {
			System.out.println("Muchas felicidades");
	        }else {
		           System.out.println("Felicidades");
		    }
		}else {
		//El promedio NO  es aprobatorio
		           System.out.println("Es necesario repasar bloques");
	          }
        }
}