
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int numberUser;
        do{
            System.out.println("Ingresa el número a verificar");
            System.out.println("Si deseas salir del programa presiona 0");
            numberUser = scanner.nextInt();

            if(numberUser != 0) {
                if (numberUser % 2 == 0) {
                    System.out.println("El número " + numberUser + " es par\n" );
                } else if (numberUser % 2 != 0) {
                    System.out.println("El número " + numberUser + " es impar\n");
                }
            }

        } while (numberUser != 0);

        scanner.close();
        System.out.println("Programa finalizado");

    }
}
