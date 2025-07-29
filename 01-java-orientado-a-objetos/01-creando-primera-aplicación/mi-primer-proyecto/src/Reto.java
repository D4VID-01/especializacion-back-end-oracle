import java.util.Random;
import java.util.Scanner;

public class Reto {

    public static void main(String[] args) {

        int numSecreto = new Random().nextInt(100);
        Scanner teclado = new Scanner(System.in);
        int intentos = 0;



        while (intentos < 5) {
            System.out.println("Adivina el número secreto en 0 y 100, escribelo aquí:");
            int numUsuario = teclado.nextInt();


            if (numUsuario > numSecreto) {
                System.out.println("el número secreto es menor al ingresado");
            } else if (numUsuario < numSecreto){
                System.out.println("El número secreto es mayor al ingresado");
            } else{
                System.out.println("Felicidades! Acertaste el numero secreto");
                break;
            }

            intentos++;
        }

        if (intentos == 5) {
            System.out.println("Lo siento, no conseguiste adivinar el número en: " + intentos +  " intentos. El número era: "+ numSecreto);
        }



    }
}
