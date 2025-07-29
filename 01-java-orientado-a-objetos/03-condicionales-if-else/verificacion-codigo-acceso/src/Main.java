import java.util.Scanner;

/*
*Juan está desarrollando un sistema de seguridad para una empresa. Para acceder al sistema,
* el usuario debe proporcionar:

-Un código de acceso numérico (el código correcto es 2023).
-Un nivel de permiso numérico (los niveles válidos son 1, 2 o 3).
-El sistema solo permitirá el acceso si:

1- El código de acceso es correcto.
2- El nivel de permiso es válido (1, 2 o 3).
De lo contrario, el acceso será denegado, y el programa debe informar el motivo
* (código incorrecto, nivel de permiso inválido o ambos).

Crea un programa que reciba el código de acceso y el nivel de permiso y muestre un mensaje
* indicando si el acceso fue permitido o denegado, además del motivo, si es el caso.
*/

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int CODE_ACCES = 2023;
        final int PERMISSION_LEVEL_MIN = 1;
        final int PERMISSION_LEVEL_MAX = 3;

        boolean accesState = false;

        while (!accesState){

            System.out.println("\nPara acceder al sistema por favor:");
            System.out.println("- Ingrese el código de acceso");
            int codeAccesUser = scanner.nextInt();
            System.out.println("Ingrese el nivel de permiso");
            int permissionLevelUser = scanner.nextInt();

            if (codeAccesUser == CODE_ACCES && permissionLevelUser >= PERMISSION_LEVEL_MIN && permissionLevelUser <= PERMISSION_LEVEL_MAX){
                System.out.println("Acceso concedido. ¡Bienvenid@ al sistema!");
                accesState = true;
            } else {
                System.out.println("¡Acceso denegado! Motivos(s):\n");
                if (codeAccesUser != CODE_ACCES)
                    System.out.println("-> Código de acceso incorrecto");
                if (permissionLevelUser < PERMISSION_LEVEL_MIN || permissionLevelUser > PERMISSION_LEVEL_MAX)
                    System.out.println("-> El nivel de permiso es inválido");

            }
        }

        scanner.close();


    }
}