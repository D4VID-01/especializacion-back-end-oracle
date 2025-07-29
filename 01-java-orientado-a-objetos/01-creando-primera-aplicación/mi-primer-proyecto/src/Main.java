public class Main {
    public static void main(String[] args) {
        System.out.println( "¡Concluí la aula 01 y ahora estoy sumergiéndome en Java!");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDePelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;

        System.out.println(media);

        String sipnosis = """
                Matrix es una paradoja 
                La mejor pelicula del fin del milenio
                Fué lanzada en:""" + fechaDeLanzamiento;

        System.out.println(sipnosis);

//        //Formateo explícito ----------------------------------------------
//        int clasificacion =(int) (media/2);
//        System.out.println(clasificacion);

//        //Casteo de variables ----------------------------------------------
//        String saludo = "Hola, mi nombre es ";
//        String nombre = "Alicia ";
//        String continuacion = "y mi edad es ";
//        int edad = 17;
//
//        String mensaje = """
//                %s %s %s %d
//                """.formatted(saludo, nombre, continuacion, edad);
//        System.out.println(mensaje);


    }
}

