package ejercicio2;
import java.util.Scanner;
import java.util.Arrays;

public class MenoraMayor {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario los tres números
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        // Guardar en un arreglo
        int[] numeros = {num1, num2, num3};

        // Ordenar el arreglo
        Arrays.sort(numeros);

        // Mostrar los números ordenados
        System.out.println("Números ordenados de menor a mayor:");
        System.out.println(numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
        
        scanner.close();
    }

}
