package figuras;

public class FigurasConAsteriscos {
    public static void main(String[] args) {

        // Primera figura
        System.out.println("Primera figura:");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(); // Línea en blanco entre figuras

        // Segunda figura (pirámide)
        System.out.println("Segunda figura:");
        int filas = 5;
        for (int i = 1; i <= filas; i++) {
            // Espacios
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }
            // Asteriscos
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
