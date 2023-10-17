import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa el número de alumnos en la clase: ");
        int numeroAlumnos = teclado.nextInt();

        int aprobados = 0;
        int suspensos = 0;

        for (int i = 1; i <= numeroAlumnos; i++) {
            System.out.print("Ingresa la nota del alumno " + i + ": ");
            int nota = teclado.nextInt();

            if (nota >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
        }

        double porcentajeAprobados = (double) aprobados / numeroAlumnos * 100;
        double porcentajeSuspensos = (double) suspensos / numeroAlumnos * 100;

        System.out.println("Número de aprobados: " + aprobados);
        System.out.println("Número de suspensos: " + suspensos);
        System.out.println("Porcentaje de aprobados: " + porcentajeAprobados + "%");
        System.out.println("Porcentaje de suspensos: " + porcentajeSuspensos + "%");
    }
}
