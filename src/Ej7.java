import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Este programa calcula el Máximo Común Divisor (MCD) de dos números enteros.");

        // Solicitar el primer número
        System.out.print("Por favor, ingresa el primer número entero mayor que 0: ");
        int numero1 = scanner.nextInt();

        // Validar que el número sea mayor que 0
        if (numero1 <= 0) {
            System.out.println("El número debe ser mayor que 0. Reinicia el programa.");
            return;
        }

        // Solicitar el segundo número
        System.out.print("Por favor, ingresa el segundo número entero mayor que 0: ");
        int numero2 = scanner.nextInt();

        // Validar que el número sea mayor que 0
        if (numero2 <= 0) {
            System.out.println("El número debe ser mayor que 0. Reinicia el programa.");
            return;
        }

        // Calcular el MCD utilizando el algoritmo de Euclides
        int mcd = calcularMCD(numero1, numero2);

        // Mostrar el resultado
        System.out.println("El Máximo Común Divisor (MCD) de " + numero1 + " y " + numero2 + " es: " + mcd);
    }

    // Método para calcular el MCD usando el algoritmo de Euclides
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
