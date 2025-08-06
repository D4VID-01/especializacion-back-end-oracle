import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba el límite de la tarjeta: ");
        double limite = scanner.nextDouble();
        TarjetaCredito tarjeta = new TarjetaCredito(limite);

        int salir = 1;
        while(salir != 0) {
            System.out.println("Escriba el nombre de la compra:");
            String nombre = scanner.next();

            System.out.println("Escriba el precio de la compra:");
            double precio = Double.valueOf(scanner.next());

            Compra compra = new Compra(nombre, precio);
            boolean compraRealizada = tarjeta.lanzarCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Escriba 0 para salir o 1 para continuar");
                salir = scanner.nextInt();
                while (salir != 0 && salir != 1) {
                    System.out.println("Ingrese una opción válida");
                    System.out.println("Escriba 0 para salir o 1 para continuar");
                    salir = scanner.nextInt();
                }
            } else {
                System.out.println("Saldo insuficiente!");
                salir = 0;
            }
        }

        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");
        Collections.sort(tarjeta.getListaDeCompras());

        for (Compra compra : tarjeta.getListaDeCompras()) {
            System.out.println(compra.getNombre() + " - " + "$" + compra.getPrecio());
        }
        System.out.println("\nTotal: $" + tarjeta.total());

        System.out.println("\n***********************");
        System.out.println("\nSaldo restante: " + tarjeta.getSaldo());

    }
}