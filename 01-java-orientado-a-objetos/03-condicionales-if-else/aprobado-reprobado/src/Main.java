import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double calificacion;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu calificación final para validarla");

        calificacion = scanner.nextDouble();

        while (calificacion < 0 || calificacion > 10) {
            System.out.println("⚠ Calificación inválida. Debe estar entre 0 y 10. ⚠ \n");
            System.out.println("Ingresa tu calificación final para validarla");
            calificacion = scanner.nextDouble();
        }

        if (calificacion >= 0 && calificacion < 5.0) {
            System.out.println("El estudiante tuvo un promedio de " + calificacion + " y fue reprobado.");
        } else if (calificacion >= 5 && calificacion <= 6.9) {
            System.out.println("El estudiante tuvo un promedio de " + calificacion + " y está en recuperación.");
        } else if (calificacion >= 7 && calificacion <= 10) {
            System.out.println("El estudiante tuvo un promedio de " + calificacion + " y fue aprobado.");
        }

        scanner.close();
    }
}