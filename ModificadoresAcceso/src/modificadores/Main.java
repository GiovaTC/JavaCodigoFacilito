package modificadores;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Modificadores de acceso
		
		Usuario codi = new Usuario();
		codi.username = "Codi";
	//	codi.password = "pass";
		
		System.out.println(codi.username);
	//	System.out.println(codi.password);
		
		codi.saluda();

	}

}
