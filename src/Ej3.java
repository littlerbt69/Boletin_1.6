import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = teclado.nextInt();
        teclado.close();

        int contadorCifras = 0;

        // Manejo del caso especial cuando el número es 0
        if (numero == 0) {
            contadorCifras = 1;
        } else {
            // Utilizar un bucle while para contar las cifras
            while (numero != 0) {
                numero = numero / 10;
                contadorCifras++;
            }
        }

        System.out.println("El número tiene " + contadorCifras + " cifras.");
    }
}
