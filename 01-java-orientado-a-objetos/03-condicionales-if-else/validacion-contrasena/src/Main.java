
/*
* Marcos está estudiando geometría y necesita verificar si tres lados pueden formar un triángulo.
* Para que tres lados formen un triángulo, la suma de dos lados debe ser mayor que el tercer lado.
* Él quiere un programa que reciba tres lados y muestre un mensaje indicando si los lados pueden formar un triángulo o no.
* Con base en este escenario, crea un programa que reciba tres lados y muestre un mensaje indicando
* si los lados pueden formar un triángulo o no.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String passwordSystem = "123456";
        String passwordUser;

        do {
            System.out.println("Para ingresar, digita la contraseña: ");
            passwordUser = scanner.nextLine();

            if (passwordUser.equals(passwordSystem)) System.out.println("¡Acceso permitido! Bienvenid@.");
            else System.out.println("!Contraseña incorrecta! Intentelo nuevmente.");

        } while (!passwordUser.equals(passwordSystem));

        scanner.close();

    }
}