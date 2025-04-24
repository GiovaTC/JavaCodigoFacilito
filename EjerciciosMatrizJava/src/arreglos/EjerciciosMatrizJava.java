package arreglos;

public class EjerciciosMatrizJava {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int sumaTotal = 0;
        int max = Integer.MIN_VALUE;
        int repeticionesMax = 0;
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;
        int sumaUltimaFila = 0;

        System.out.println("Matriz generada:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
                System.out.print(matriz[i][j] + "\t");

                sumaTotal += matriz[i][j];

                // Buscar el mayor y contar repeticiones
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    repeticionesMax = 1;
                } else if (matriz[i][j] == max) {
                    repeticionesMax++;
                }

                // Diagonales
                if (i == j) sumaDiagonalPrincipal += matriz[i][j];
                if (i + j == 4) sumaDiagonalSecundaria += matriz[i][j];

                // Última fila
                if (i == 4) sumaUltimaFila += matriz[i][j];
            }
            System.out.println();
        }

        double promedio = sumaTotal / 25.0;
        System.out.println("\nPromedio de la matriz: " + promedio);
        System.out.println("Número mayor: " + max + " (se repite " + repeticionesMax + " veces)");

        // Números primos
        System.out.print("Números primos: ");
        for (int[] fila : matriz) {
            for (int num : fila) {
                if (esPrimo(num)) {
                    System.out.print(num + " ");
                }
            }
        }

        // Números pares
        System.out.print("\nNúmeros pares: ");
        for (int[] fila : matriz) {
            for (int num : fila) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
        }

        System.out.println("\nSuma de la diagonal principal: " + sumaDiagonalPrincipal);
        System.out.println("Suma de la diagonal secundaria: " + sumaDiagonalSecundaria);
        System.out.println("Suma de la última fila: " + sumaUltimaFila);

        // Verificar si es un cuadrado mágico
        if (esCuadradoMagico(matriz)) {
            System.out.println("Cuadrado Mágico");
        } else {
            System.out.println("No es un Cuadrado Mágico");
        }
    }

    static boolean esPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static boolean esCuadradoMagico(int[][] m) {
        int sumaObjetivo = 0;
        for (int j = 0; j < 5; j++) {
            sumaObjetivo += m[0][j];
        }

        for (int i = 1; i < 5; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                sumaFila += m[i][j];
            }
            if (sumaFila != sumaObjetivo) return false;
        }

        for (int j = 0; j < 5; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 5; i++) {
                sumaColumna += m[i][j];
            }
            if (sumaColumna != sumaObjetivo) return false;
        }

        int sumaDiag1 = 0, sumaDiag2 = 0;
        for (int i = 0; i < 5; i++) {
            sumaDiag1 += m[i][i];
            sumaDiag2 += m[i][4 - i];
        }

        return sumaDiag1 == sumaObjetivo && sumaDiag2 == sumaObjetivo;
    }
}
