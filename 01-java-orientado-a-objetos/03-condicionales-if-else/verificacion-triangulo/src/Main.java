import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double firstSide;
        double secondSide;
        double thirdSide;


        System.out.println("Para verificar si puede formar un triángulo ingrese lo siguiente:");
        System.out.println("Ingrese en centimetros la longitud del primer lado:");
        firstSide = scanner.nextDouble();
        System.out.println("Ingrese en centimetros la longitud del segundo lado:");
        secondSide = scanner.nextDouble();
        System.out.println("Ingrese en centimetros la longitud del tercer lado:");
        thirdSide = scanner.nextDouble();

        if ((firstSide + secondSide) > thirdSide) System.out.println("Con las longitudes de " + firstSide + " cm, " + secondSide + " cm y " + thirdSide + " cm sí puedes formar un triángulo");
        else System.out.println("Con las longitudes de " + firstSide + " cm, " + secondSide + " cm y " + thirdSide + " cm no puedes formar un triángulo");

        scanner.close();
    }
}