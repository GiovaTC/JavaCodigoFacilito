package clasesyobj;

import clasesyobj.Perro;

public class This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  Clase y Objetos
		
		Perro lassie = new Perro(); //Instancia
		
		lassie.establecerAtributos("Lassie", "Collie", 4); //Argumentos
		
		lassie.nombre = "Lassie";
		lassie.raza = "Collie";
		lassie.edad = 4;
		
		System.out.println("El nombre es : " + lassie.nombre);
		System.out.println("La raza es : " + lassie.raza);
		System.out.println("La edad es : " + lassie.edad);
		
		lassie.comer();
		lassie.ladrar();
		lassie.dormir();
	}

}

