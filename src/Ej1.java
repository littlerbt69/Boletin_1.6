import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce primer numero: ");
        double num1 = teclado.nextDouble();

        System.out.println("Introduce segundo numero: ");
        double num2 = teclado.nextDouble();

        System.out.println("Introduce tercer numero: ");
        double num3 = teclado.nextDouble();

        if (num1 > num2) {
            double temporal = num1; //almacenar num1 en variable temporal
            num1 = num2; //actualizar el num1 con el valor de num2
            num2 = temporal; //num2 se actualiza con el valor de num1
        }

        if (num2 > num3) {
            double temporal = num2; //almacenar num2 en variable temporal
            num2 = num3; //actualizar el num2 con el valor de num3
            num3 = temporal; //num3 se actualiza con el valor de num1
        }

        if (num1 > num2) {
            double temporal = num1; //almacenar num1 en variable temporal
            num1 = num2; //actualizar el num1 con el valor de num2
            num2 = temporal; //num2 se actualiza con el valor de num1
        }

        System.out.println("Los numeros ordenados de menor a mayor son: " + num1 + " , " + num2 + " y " + num3);
    }
}
