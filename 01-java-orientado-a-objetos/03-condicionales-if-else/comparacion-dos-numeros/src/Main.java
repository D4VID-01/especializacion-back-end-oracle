import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber;
        int secondNumber;

        System.out.println("Ingresa el primer número a comparar");
        firstNumber = scanner.nextInt();
        System.out.println("Ingresa el segundo número a ingresar");
        secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) System.out.println("El número " + firstNumber + " es mayor que el número " + secondNumber);
        else if (secondNumber > firstNumber) System.out.println("El número" + secondNumber + " es mayor que el número " + firstNumber);
        else System.out.println("El número " + firstNumber + " y el número " + secondNumber + " son iguales");

        scanner.close();
        System.out.println("Programa finalizado");

    }
}