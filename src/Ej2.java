import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base, exponente;

        System.out.println("Este programa calcula la potencia (base elevada al exponente) a través de productos.");

        do {
            System.out.print("Por favor, ingresa la base (entero positivo o 0): ");
            base = scanner.nextInt();
        } while (base < 0);

        do {
            System.out.print("Por favor, ingresa el exponente (entero positivo o 0): ");
            exponente = scanner.nextInt();
        } while (exponente < 0);

        int resultado = calcularPotencia(base, exponente);
        System.out.println("El resultado de " + base + " elevado a la " + exponente + " es: " + resultado);
    }

    public static int calcularPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }

        int resultado = 1;
        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }

        return resultado;
    }
}
