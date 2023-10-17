import java.util.Scanner;
import java.util.Random;

public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int intentos = 0;
        final int maxIntentos = 5;

        System.out.println("¡Bienvenido al juego de adivinar el número secreto!");
        System.out.println("El número secreto está entre 1 y 100.");
        System.out.println("Tienes " + maxIntentos + " intentos para adivinarlo.");

        while (intentos < maxIntentos) {
            System.out.print("Introduce un número: ");
            int intento = teclado.nextInt();

            if (intento < 1 || intento > 100) {
                System.out.println("El número debe estar entre 1 y 100.");
                intentos++;
            } else if (intento == numeroSecreto) {
                System.out.println("¡Felicidades! Has adivinado el número secreto (" + numeroSecreto + ").");
                break;
            } else if (intento < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
                intentos++;
            } else {
                System.out.println("El número secreto es menor.");
                intentos++;
            }

            if (intentos < maxIntentos) {
                System.out.println("Te quedan " + (maxIntentos - intentos) + " intentos.");
            }
        }

        if (intentos == maxIntentos) {
            System.out.println("¡Has agotado tus intentos! El número secreto era " + numeroSecreto + ". ¡Mejor suerte la próxima vez!");
        }
    }
}
