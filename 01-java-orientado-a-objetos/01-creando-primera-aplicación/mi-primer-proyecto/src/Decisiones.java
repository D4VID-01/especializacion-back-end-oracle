public class Decisiones {


    public static void main(String[] args) {

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDePelicula = 8.2;
        String tipoPlan = "Plus";

//  Código que prueba los operadores relacionales -------------------------------------
        if (fechaDeLanzamiento > 2022){
            System.out.println("Peliculas más populares");
        } else {
            System.out.println("Pelicula retro que aún vale la pena ver");
        }

        if (incluidoEnElPlan || tipoPlan.toLowerCase().equals("plus") ){
            System.out.println("Disfrute de su pelicula");
        } else {
            System.out.println("Pelicula no disponible en su plan actual");
        }
    }
}
