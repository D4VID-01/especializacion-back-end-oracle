import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double productPrice;

        System.out.println("Ingresa el valor de tu compra: ");

        productPrice = scanner.nextInt();

        if(productPrice >= 100) {
            double newPrice = productPrice - (productPrice * 0.10);
            System.out.println("Descuento del 10% aplicado a tu compra de $" + productPrice + " MXN");
            System.out.println("Precio final de tu compra: $" + newPrice + " MXN");
        } else {
            System.out.println("Precio final de tu compra: $" + productPrice + " MXN");
        }
    }
}