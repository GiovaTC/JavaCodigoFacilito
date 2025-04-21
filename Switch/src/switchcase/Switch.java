package switchcase;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Switch
		
		String colorLuz = "Rosa";
		
		switch(colorLuz)
		{
		case "Verde" :
			System.out.println("Puede continuar");
			//
			break;
		case "Amarillo" :
			System.out.println("Alto parcial");
			break;
		case "Rojo" :
			System.out.println("Alto total");
			break;
		
		default:
			System.out.println("Color no valido");
			break;
		
		}

	}

}
