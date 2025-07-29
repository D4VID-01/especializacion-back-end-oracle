import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double quantity;

        do {
            System.out.println("Ingresa la cantidad a verificar:");
            quantity = scanner.nextDouble();

            if (quantity < 1000 || quantity > 5000)
                System.out.println("La cantidad de " + quantity + " USD, no esta dentro del intervalo permitido para el préstamo. Puede intentar otra cantidad.");
            else
                System.out.println("La cantidad de " + quantity + " USD50 sí se encuentra dentro del intervalo de prestamo. Pude probar otra cantidad si gusta.");
        } while (quantity < 1000 || quantity > 5000);
        scanner.close();
        System.out.println("Gracias por tu preferencia");
    }

}