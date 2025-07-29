import java.util.Scanner;

/*
María trabaja en un banco de sangre y necesita verificar si un donante es compatible para donar sangre.
Para ser compatible, el donante debe cumplir con los siguientes criterios:

- Tener entre 18 y 65 años.
- Pesar más de 50 kg.
- Ella desea un programa que reciba la edad y el peso del donante e indique si es compatible para donar sangre.
- Si no lo es, el programa debe indicar qué criterio no fue cumplido.

¿Cómo crearías un programa que reciba la edad y el peso del donante y muestre un mensaje indicando
si es compatible o no, además de informar qué criterio no fue cumplido, si es el caso?

*/

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age;
        double weight;

        System.out.println("Para verificar si es adecuad@ para donar sangre, ingrese lo siguiente:");
        System.out.println("Por favor, ingrese la edad del donante:");
        age = scanner.nextInt();
        System.out.println("Por favor, ingrese el peso en Kg del donante");
        weight = scanner.nextDouble();

        if (age >= 18 && weight >= 58) System.out.println("Con la edad de " + age + " años y un peso de " + weight + " kilogramos, el candidato sí es adecuado para donar sangre.");
        else System.out.println("Con la edad de " + age + " años y un peso de " + weight + " kilogramos, el candidato no es adecuado para donar sangre.");

        scanner.close();
    }
}