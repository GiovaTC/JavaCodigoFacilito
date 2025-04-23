package arreglos;

public class RecorrerMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz [][] = new int[4][3];
		// x=0, y=0
		
		 matriz[0][0] = 1;
		 matriz[0][1] = 2;
		 matriz[0][2] = 3;
		
		 matriz[1][0] = 1;
		 matriz[1][1] = 2;
		 matriz[1][2] = 3;
		
		 matriz[2][0] = 1;
		 matriz[2][1] = 2;
		 matriz[2][2] = 3;
		 
		 matriz[3][0] = 1;
		 matriz[3][1] = 2;
		 matriz[3][2] = 3;
		 
		 for(int posX = 0; posX < matriz.length; posX++)
		 {
			 for(int posY = 0; posY < matriz[posX].length; posY++)
			 {
				 System.out.println(matriz[posX][posY]);
			 }
		 }
		 
		 for( int[] fila : matriz)
		 {
			 for(int celda : fila)
			 {
				 System.out.println(celda);
			 }
		 }
	}
}
