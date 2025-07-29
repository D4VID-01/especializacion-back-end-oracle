public class Main {
    public static void main(String[] args) {

        //Conversión de grados Celsius a Fahrenheit -----------------------------------------
        double gradosCelsius = 30.7;
        double gradosFahrenheit = (gradosCelsius*1.8)+32;
        int conversiónEntero = (int) gradosFahrenheit;

        String mensajeGrados = """
                %.2f grados Celsius corresponden a %d grados Fahrenheit
                """.formatted(gradosCelsius, conversiónEntero);

        System.out.println(mensajeGrados);
    }
}