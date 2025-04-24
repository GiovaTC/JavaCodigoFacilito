package arreglos;

import java.util.Arrays;

public class EjerciciosArreglosJava 
{
    public static void main(String[] args) 
    {
        int[] numeros = new int[100];

        // Llenar el arreglo con números aleatorios entre 0 y 99
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 100);
        }

        // Mostrar número mayor y menor
        int mayor = numeros[0];
        int menor = numeros[0];
        boolean existeCien = false;

        System.out.println("Números primos:");
        for (int num : numeros) {
            if (num > mayor) mayor = num;
            if (num < menor) menor = num;
            if (num == 100) existeCien = true;
            if (esPrimo(num)) System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("\nNúmeros pares:");
        for (int num : numeros) {
            if (num % 2 == 0) System.out.print(num + " ");
        }
        System.out.println();

        // Mostrar número mayor y menor
        System.out.println("\nNúmero mayor: " + mayor);
        System.out.println("Número menor: " + menor);

        // Ordenar y mostrar el arreglo de forma ascendente
        Arrays.sort(numeros);
        System.out.println("\nArreglo ordenado de forma ascendente:");
        System.out.println(Arrays.toString(numeros));

        // Calcular promedio
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        double promedio = (double)suma / numeros.length;
        System.out.println("\nPromedio del arreglo: " + promedio);

        // Suma del primer y último elemento
        int sumaExtremos = numeros[0] + numeros[numeros.length - 1];
        System.out.println("Suma del primer y último elemento: " + sumaExtremos);

        // Verificar si existe al menos un cien
        if (existeCien) {
            System.out.println("Existe cien");
        }
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}


/*¿Qué hace este programa?
 * 
 * Genera 100 números aleatorios entre 0 y 99.
 * Imprime el número mayor y el menor.
 * Imprime los números primos y los pares.
 * Muestra el arreglo ordenado.
 * Calcula y muestra el promedio.
 * Muestra la suma del primer y último número del arreglo.
 * Verifica si hay al menos un 100 y muestra "Existe cien" si lo hay.
 * ¿Te gustaría que lo adaptemos para usar números entre 1 y 100 en vez de 0 a 99?*/
		
