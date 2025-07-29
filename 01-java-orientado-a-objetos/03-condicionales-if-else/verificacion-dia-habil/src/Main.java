
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        String[] weekDays = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
        String userDay;

        do {
            System.out.println("Ingresa el día a verificar (para terminar escribe salir):");
            userDay = scanner.nextLine();

            if (Arrays.asList(weekDays).contains(userDay)){

                if (userDay.equalsIgnoreCase("sabado")||userDay.equalsIgnoreCase("domingo"))
                System.out.println(userDay + " día no habil.");
                else System.out.println(userDay + " es un día habil.");

            } else if (!userDay.equalsIgnoreCase("salir"))
                System.out.println("Día no reconocido, intenta uno diferente");

        } while (!userDay.equalsIgnoreCase("salir"));

        scanner.close();
        System.out.println("Programa finalizado");

    }
}