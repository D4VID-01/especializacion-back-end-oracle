import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {



        String nombre = "Luis David";
        String tipoDeCuenta = "Corriente";
        double saldo = 2500.67;
        int opcionUsuario = 0;

        System.out.println("*****************************************************************");
        System.out.println("\nNombre del cliente : " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("Su saldo actual es: $ " + saldo + " MXN\n");
        System.out.println("*****************************************************************\n");

        String menu = """
                *** Escriba el número  de la opción deseada ***
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Terminar operación
                """;


        while (opcionUsuario != 9) {

            System.out.println(menu);
            Scanner teclado = new Scanner(System.in);
            opcionUsuario = teclado.nextInt();

            switch (opcionUsuario){
                case 1:
                    System.out.println("Su saldo actual es de: $ " + saldo + "MXN");
                    break;

                case 2:
                    System.out.println("Ingrese la cantidad de saldo que desea retirar");
                    double retirarSaldo = teclado.nextDouble();
                    if (retirarSaldo > saldo) {
                        System.out.println("Saldo actual insuficiente");
                    } else {
                        saldo -= retirarSaldo;
                        System.out.println("Su saldo actualizado es de: $ " + saldo + "MXN");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de saldo que desea depositar");
                    double depositarSaldo = teclado.nextDouble();
                    saldo += depositarSaldo;
                    System.out.println("Su saldo actualizado es de: $ " + saldo + "MXN");
                    break;
                case 9:
                    System.out.println("Opereración terminada. Gracias por usar nuestros servicios.");
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        }
    }




}