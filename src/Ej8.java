import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Este programa calcula las soluciones de una ecuación de segundo grado Ax^2 + Bx + C = 0.");
        System.out.print("Por favor, ingresa el coeficiente A: ");
        double a = teclado.nextDouble();
        System.out.print("Por favor, ingresa el coeficiente B: ");
        double b = teclado.nextDouble();
        System.out.print("Por favor, ingresa el coeficiente C: ");
        double c = teclado.nextDouble();

        int resultado = (int) (b*b + 4*a*c);

        if (a == 0) {
            System.out.println("La ecuacion es de primer grado asi que se soluciona de otra forma");
        } else {
            if (resultado == 0) {
                System.out.println("La ecuacion tiene solo una solucion");
            } else if (resultado > 0) {
                System.out.println("La ecuacion tiene dos soluciones");
            } else {
                System.out.println("La ecuacion no tiene solucion");
            }
        }

    }
}
